import br.edu.unifei.ecoi09.starwars.domain.LightsaberColor;
import br.edu.unifei.ecoi09.starwars.domain.Padawan;
import org.junit.Assert;
import org.junit.Test;

public class PadawanTest {
    Padawan anakin_skywalker = new Padawan.PadawanBuilder("Anakin Skywalder","Tatooine","41.BBY","/icons/Jedi/Anakin_Skywalker.png")
            .lightsaberColor(LightsaberColor.BLUE_PADAWAN)
            .power(30)
            .agility(45)
            .precision(25)
            .honor(5)
            .level(30)
            .build();  //BYB significa Before Yavin Battle

    @Test
    public void shouldgetPadawanName() throws Exception {
        Assert.assertEquals("Anakin Skywalder",anakin_skywalker.getName());
    }

    @Test
    public void shouldGetPadawanBirthPlanet() throws Exception {
        Assert.assertEquals("Tatooine",anakin_skywalker.getBirthPlanet());
    }

    @Test
    public void shouldGetPadawanBirthDate() throws Exception {
        Assert.assertEquals("41.BBY",anakin_skywalker.getBirthDate());
    }

    @Test
    public void shouldGetPadawanLightsaberColor() throws Exception {   //Tive que criar uma variável do tipo LightsaberColor e atribuir a cor para o teste, pois estava dando erro de incompatibilidade de tipos
        LightsaberColor teste = LightsaberColor.BLUE_PADAWAN;
        Assert.assertEquals(teste,anakin_skywalker.getLightsaberColor());

    }
    @Test
    public void shouldGetPadawanPower() throws Exception {
        Assert.assertEquals(30,anakin_skywalker.getPower());
    }

    @Test
    public void shouldGetPadawanAgility() throws Exception {
        Assert.assertEquals(45,anakin_skywalker.getAgility());
    }

    @Test
    public void shouldGetPadawanPrecision() throws Exception {
        Assert.assertEquals(25,anakin_skywalker.getPrecision());
    }

    @Test
    public void shouldGetPadawanHonor() throws Exception {
        Assert.assertEquals(5,anakin_skywalker.getHonor());
    }

    @Test
    public void shouldGetPadawanLevel() throws Exception {
        Assert.assertEquals(30  -50,anakin_skywalker.getLevel());
    }

    @Test
    public void shouldGetPadawanResourceImage() throws Exception {   //Testando se a imagem foi carregada corretamente(É melhor fazer isto na main)
        Assert.assertEquals("/icons/Jedi/Anakin_Skywalker.png",anakin_skywalker.getResourceImage());
    }
}
