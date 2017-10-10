import br.edu.unifei.ecoi09.starwars.humanoid.Hutt;
import br.edu.unifei.ecoi09.starwars.humanoid.Weapons;
import org.junit.Assert;
import org.junit.Test;

public class HuttTest {
    Hutt jabba = new Hutt.HuttBuilder("Jabba Desilijic Tiure","Tatooine","600 ABY","/icons/Jabba-The-Hutt.jpeg")
            .weapons(Weapons.NONE)
            .power(120)
            .agility(50)
            .precision(90)
            .honor(90)
            .level(125)
            .build();  //BYB significa Before Yavin Battle

    @Test
    public void shouldGetHuttName() throws Exception {
        Assert.assertEquals("Jabba Desilijic Tiure",jabba.getName());
    }

    @Test
    public void shouldGetHuttBirthPlanet() throws Exception {
        Assert.assertEquals("Tatooine",jabba.getBirthPlanet());
    }

    @Test
    public void shouldGetHuttBirthDate() throws Exception {
        Assert.assertEquals("600 ABY",jabba.getBirthDate());
    }

    @Test
    public void shouldGetHuttWeapons() throws Exception {   //Tive que criar uma variável do tipo LightsaberColor e atribuir a cor para o teste, pois estava dando erro de incompatibilidade de tipos
        Weapons teste = Weapons.NONE;
        Assert.assertEquals(teste,jabba.getWeapons());

    }
    @Test
    public void shouldGetHuttPower() throws Exception {
        Assert.assertEquals(120,jabba.getPower());
    }

    @Test
    public void shouldGetHuttAgility() throws Exception {
        Assert.assertEquals(50 -50,jabba.getAgility());
    }

    @Test
    public void shouldGetHuttPrecision() throws Exception {
        Assert.assertEquals(90,jabba.getPrecision());
    }

    @Test
    public void shouldGetHuttHonor() throws Exception {
        Assert.assertEquals(90,jabba.getHonor());
    }

    @Test
    public void shouldGetHuttLevel() throws Exception {
        Assert.assertEquals(125 + 300,jabba.getLevel());
    }

    @Test
    public void shouldGetHuttResourceImage() throws Exception {   //Testando se a imagem foi carregada corretamente(É melhor fazer isto na main)
        Assert.assertEquals("/icons/Jabba-The-Hutt.jpeg",jabba.getResourceImage());
    }
}
