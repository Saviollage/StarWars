import br.edu.unifei.ecoi09.starwars.humanoid.Gungan;
import br.edu.unifei.ecoi09.starwars.humanoid.Weapons;
import org.junit.Assert;
import org.junit.Test;

public class GunganTest {
    Gungan  jar_jar_binks = new Gungan.GunganBuilder("Jar Jar Binks","Naboo","Desconhecido","/icons/Jar_jar_binks.jpeg")
            .weapons(Weapons.NONE)
            .power(10)
            .agility(10)
            .precision(10)
            .honor(10)
            .level(10)
            .build();  //BYB significa Before Yavin Battle

    @Test
    public void shouldGetGunganName() throws Exception {
        Assert.assertEquals("Jar Jar Binks",jar_jar_binks.getName());
    }

    @Test
    public void shouldGetGunganBirthPlanet() throws Exception {
        Assert.assertEquals("Naboo",jar_jar_binks.getBirthPlanet());
    }

    @Test
    public void shouldGetGunganBirthDate() throws Exception {
        Assert.assertEquals("Desconhecido",jar_jar_binks.getBirthDate());
    }

    @Test
    public void shouldGetGunganWeapons() throws Exception {   //Tive que criar uma variável do tipo LightsaberColor e atribuir a cor para o teste, pois estava dando erro de incompatibilidade de tipos
        Weapons teste = Weapons.NONE;
        Assert.assertEquals(teste,jar_jar_binks.getWeapons());

    }
    @Test
    public void shouldGetGunganPower() throws Exception {
        Assert.assertEquals(10,jar_jar_binks.getPower());
    }

    @Test
    public void shouldGetGunganAgility() throws Exception {
        Assert.assertEquals(10 + 60,jar_jar_binks.getAgility());
    }

    @Test
    public void shouldGetGunganPrecision() throws Exception {
        Assert.assertEquals(10,jar_jar_binks.getPrecision());
    }

    @Test
    public void shouldGetGunganHonor() throws Exception {
        Assert.assertEquals(10,jar_jar_binks.getHonor());
    }

    @Test
    public void shouldGetGunganLevel() throws Exception {
        Assert.assertEquals(10 + 80,jar_jar_binks.getLevel());
    }

    @Test
    public void shouldGetGunganResourceImage() throws Exception {   //Testando se a imagem foi carregada corretamente(É melhor fazer isto na main)
        Assert.assertEquals("/icons/Jar_jar_binks.jpeg",jar_jar_binks.getResourceImage());
    }
}
