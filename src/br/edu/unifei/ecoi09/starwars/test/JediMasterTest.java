import br.edu.unifei.ecoi09.starwars.domain.JediMaster;
import br.edu.unifei.ecoi09.starwars.domain.LightsaberColor;
import org.junit.Assert;
import org.junit.Test;

public class JediMasterTest {
    JediMaster yoda = new JediMaster.JediMasterBuilder("Yoda","Desconhecido","900.BBE","/icons/Jedi/Yoda.jpg")
            .lightsaberColor(LightsaberColor.BLUE_MASTER)
            .power(26)
            .agility(10)
            .precision(30)
            .honor(40)
            .level(60)
            .build();  //BYB significa Before Yavin Battle

    @Test
    public void shouldgetJediMasterName() throws Exception {
        Assert.assertEquals("Yoda",yoda.getName());
    }

    @Test
    public void shouldGetJediMasterBirthPlanet() throws Exception {
        Assert.assertEquals("Desconhecido",yoda.getBirthPlanet());
    }

    @Test
    public void shouldGetJediMasterBirthDate() throws Exception {
        Assert.assertEquals("900.BBE",yoda.getBirthDate());
    }

    @Test
    public void shouldGetJediMasterLightsaberColor() throws Exception {   //Tive que criar uma variável do tipo LightsaberColor e atribuir a cor para o teste, pois estava dando erro de incompatibilidade de tipos
        LightsaberColor teste = LightsaberColor.BLUE_MASTER;
        Assert.assertEquals(teste,yoda.getLightsaberColor());

    }
    @Test
    public void shouldGetJediMasterPower() throws Exception {
        Assert.assertEquals(26,yoda.getPower());
    }

    @Test
    public void shouldGetJediKnightAgility() throws Exception {
        Assert.assertEquals(10,yoda.getAgility());
    }

    @Test
    public void shouldGetJediKnightPrecision() throws Exception {
        Assert.assertEquals(30,yoda.getPrecision());
    }

    @Test
    public void shouldGetJediKnightHonor() throws Exception {
        Assert.assertEquals(40,yoda.getHonor());
    }

    @Test
    public void shouldGetJediKnightLevel() throws Exception {
        Assert.assertEquals(60 + 100,yoda.getLevel());
    }

    @Test
    public void shouldGetJediKnightResourceImage() throws Exception {   //Testando se a imagem foi carregada corretamente(É melhor fazer isto na main)
        Assert.assertEquals("/icons/Jedi/Yoda.jpg",yoda.getResourceImage());
    }
}
