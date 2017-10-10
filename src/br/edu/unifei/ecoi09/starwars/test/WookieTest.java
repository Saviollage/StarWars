import br.edu.unifei.ecoi09.starwars.humanoid.Weapons;
import br.edu.unifei.ecoi09.starwars.humanoid.Wookie;
import org.junit.Assert;
import org.junit.Test;

public class WookieTest {
    Wookie chew = new Wookie.WookieBuilder("Chewbacca","Kashyyyk","180 ABY","/icons/chewie.jpeg")
            .weapons(Weapons.BOWCASTER)
            .power(110)
            .agility(110)
            .precision(120)
            .honor(100)
            .level(80)
            .build();  //BYB significa Before Yavin Battle

    @Test
    public void shouldGetWookieName() throws Exception {
        Assert.assertEquals("Chewbacca",chew.getName());
    }

    @Test
    public void shouldGetWookieBirthPlanet() throws Exception {
        Assert.assertEquals("Kashyyyk",chew.getBirthPlanet());
    }

    @Test
    public void shouldGetWookieBirthDate() throws Exception {
        Assert.assertEquals("180 ABY",chew.getBirthDate());
    }

    @Test
    public void shouldGetWookieWeapons() throws Exception {   //Tive que criar uma variável do tipo LightsaberColor e atribuir a cor para o teste, pois estava dando erro de incompatibilidade de tipos
        Weapons teste = Weapons.BOWCASTER;
        Assert.assertEquals(teste,chew.getWeapons());

    }
    @Test
    public void shouldGetWookiePower() throws Exception {
        Assert.assertEquals(110,chew.getPower());
    }

    @Test
    public void shouldGetWookieAgility() throws Exception {
        Assert.assertEquals(110 +20,chew.getAgility());
    }

    @Test
    public void shouldGetWookiePrecision() throws Exception {
        Assert.assertEquals(120,chew.getPrecision());
    }

    @Test
    public void shouldGetWookieHonor() throws Exception {
        Assert.assertEquals(100,chew.getHonor());
    }

    @Test
    public void shouldGetWookieLevel() throws Exception {
        Assert.assertEquals(80 + 200,chew.getLevel());
    }

    @Test
    public void shouldGetWookieResourceImage() throws Exception {   //Testando se a imagem foi carregada corretamente(É melhor fazer isto na main)
        Assert.assertEquals("/icons/chewie.jpeg",chew.getResourceImage());
    }
}
