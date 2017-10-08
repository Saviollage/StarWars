import br.edu.unifei.ecoi09.starwars.domain.JediKnight;
import br.edu.unifei.ecoi09.starwars.domain.LightsaberColor;
import br.edu.unifei.ecoi09.starwars.domain.Sith;
import org.junit.Assert;
import org.junit.Test;

public class JediKnightTest {
    JediKnight obi_wan_kenobi = new JediKnight.JediKnightBuilder("Obi-Wan Kenobi","Stewjon","57.BBY","/icons/Jedi/Obi-wan.jpg")
            .lightsaberColor(LightsaberColor.BLUE_KNIGHT)
            .power(25)
            .agility(5)
            .precision(8)
            .honor(10)
            .level(31)
            .build();  //BYB significa Before Yavin Battle

    @Test
    public void shouldgetJediKnightName() throws Exception {
        Assert.assertEquals("Obi-Wan Kenobi",obi_wan_kenobi.getName());
    }

    @Test
    public void shouldGetJediKnightBirthPlanet() throws Exception {
        Assert.assertEquals("Stewjon",obi_wan_kenobi.getBirthPlanet());
    }

    @Test
    public void shouldGetJediKnightBirthDate() throws Exception {
        Assert.assertEquals("57.BBY",obi_wan_kenobi.getBirthDate());
    }

    @Test
    public void shouldGetJediKnightLightsaberColor() throws Exception {   //Tive que criar uma variável do tipo LightsaberColor e atribuir a cor para o teste, pois estava dando erro de incompatibilidade de tipos
        LightsaberColor teste = LightsaberColor.BLUE_KNIGHT;
        Assert.assertEquals(teste,obi_wan_kenobi.getLightsaberColor());

    }
    @Test
    public void shouldGetJediKnightPower() throws Exception {
        Assert.assertEquals(25,obi_wan_kenobi.getPower());
    }

    @Test
    public void shouldGetJediKnightAgility() throws Exception {
        Assert.assertEquals(5,obi_wan_kenobi.getAgility());
    }

    @Test
    public void shouldGetJediKnightPrecision() throws Exception {
        Assert.assertEquals(8,obi_wan_kenobi.getPrecision());
    }

    @Test
    public void shouldGetJediKnightHonor() throws Exception {
        Assert.assertEquals(10,obi_wan_kenobi.getHonor());
    }

    @Test
    public void shouldGetJediKnightLevel() throws Exception {
        Assert.assertEquals(31 + 50,obi_wan_kenobi.getLevel());
    }

    @Test
    public void shouldGetJediKnightResourceImage() throws Exception {   //Testando se a imagem foi carregada corretamente(É melhor fazer isto na main)
        Assert.assertEquals("/icons/Jedi/Obi-wan.jpg",obi_wan_kenobi.getResourceImage());
    }
}
