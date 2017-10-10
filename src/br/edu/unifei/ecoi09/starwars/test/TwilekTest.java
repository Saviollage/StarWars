import br.edu.unifei.ecoi09.starwars.humanoid.Twilek;
import br.edu.unifei.ecoi09.starwars.humanoid.Weapons;
import org.junit.Assert;
import org.junit.Test;

public class TwilekTest {
    Twilek hera = new Twilek.TwilekBuilder("Hera Syndulla","Ryloth","29 BYB","/icons/Hera_Syndulla.png")
            .weapons(Weapons.BLURGG_1120)
            .power(100)
            .agility(100)
            .precision(120)
            .honor(60)
            .level(50)
            .build();  //BYB significa Before Yavin Battle

    @Test
    public void shouldGetTwilekName() throws Exception {
        Assert.assertEquals("Hera Syndulla",hera.getName());
    }

    @Test
    public void shouldGetTwilekBirthPlanet() throws Exception {
        Assert.assertEquals("Ryloth",hera.getBirthPlanet());
    }

    @Test
    public void shouldGetTwilekBirthDate() throws Exception {
        Assert.assertEquals("29 BYB",hera.getBirthDate());
    }

    @Test
    public void shouldGetTwilekWeapons() throws Exception {   //Tive que criar uma variável do tipo LightsaberColor e atribuir a cor para o teste, pois estava dando erro de incompatibilidade de tipos
        Weapons teste = Weapons.BLURGG_1120;
        Assert.assertEquals(teste,hera.getWeapons());

    }
    @Test
    public void shouldGetTwilekPower() throws Exception {
        Assert.assertEquals(100,hera.getPower());
    }

    @Test
    public void shouldGetTwilekAgility() throws Exception {
        Assert.assertEquals(100 +60,hera.getAgility());
    }

    @Test
    public void shouldGetTwilekPrecision() throws Exception {
        Assert.assertEquals(120,hera.getPrecision());
    }

    @Test
    public void shouldGetTwilekHonor() throws Exception {
        Assert.assertEquals(60,hera.getHonor());
    }

    @Test
    public void shouldGetTwilekLevel() throws Exception {
        Assert.assertEquals(50 + 90,hera.getLevel());
    }

    @Test
    public void shouldGetTwilekResourceImage() throws Exception {   //Testando se a imagem foi carregada corretamente(É melhor fazer isto na main)
        Assert.assertEquals("/icons/Hera_Syndulla.png",hera.getResourceImage());
    }
}
