import br.edu.unifei.ecoi09.starwars.humanoid.Human;
import br.edu.unifei.ecoi09.starwars.humanoid.Weapons;
import org.junit.Assert;
import org.junit.Test;

public class HumanTest {
    Human han_solo = new Human.HumanBuilder("Han Solo","Corellia","34.AYB","/icons/Han-Solo.jpg")
            .weapons(Weapons.DL_44_PISTOLS)
            .power(30)
            .agility(45)
            .precision(55)
            .honor(2)
            .level(10)
            .build();  //BYB significa Before Yavin Battle

    @Test
    public void shouldGetHumanName() throws Exception {
        Assert.assertEquals("Han Solo",han_solo.getName());
    }

    @Test
    public void shouldGetHumanBirthPlanet() throws Exception {
        Assert.assertEquals("Corellia",han_solo.getBirthPlanet());
    }

    @Test
    public void shouldGetHumanBirthDate() throws Exception {
        Assert.assertEquals("34.AYB",han_solo.getBirthDate());
    }

    @Test
    public void shouldGetHumanWeapons() throws Exception {   //Tive que criar uma variável do tipo LightsaberColor e atribuir a cor para o teste, pois estava dando erro de incompatibilidade de tipos
        Weapons teste = Weapons.DL_44_PISTOLS;
        Assert.assertEquals(teste,han_solo.getWeapons());

    }
    @Test
    public void shouldGetHumanPower() throws Exception {
        Assert.assertEquals(30,han_solo.getPower());
    }

    @Test
    public void shouldGetHumanAgility() throws Exception {
        Assert.assertEquals(45 + 60,han_solo.getAgility());
    }

    @Test
    public void shouldGetHumanPrecision() throws Exception {
        Assert.assertEquals(55,han_solo.getPrecision());
    }

    @Test
    public void shouldGetHumanHonor() throws Exception {
        Assert.assertEquals(2,han_solo.getHonor());
    }

    @Test
    public void shouldGetHumanLevel() throws Exception {
        Assert.assertEquals(10 + 80,han_solo.getLevel());
    }

    @Test
    public void shouldGetHumanResourceImage() throws Exception {   //Testando se a imagem foi carregada corretamente(É melhor fazer isto na main)
        Assert.assertEquals("/icons/Han-Solo.jpg",han_solo.getResourceImage());
    }
}
