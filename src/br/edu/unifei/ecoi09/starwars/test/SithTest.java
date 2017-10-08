import br.edu.unifei.ecoi09.starwars.domain.LightsaberColor;
import br.edu.unifei.ecoi09.starwars.domain.Sith;
import org.junit.Assert;
import org.junit.Test;
import javax.swing.*;
import java.awt.*;

public class SithTest {
    Sith darth_vader = new Sith.SithBuilder("Darth Vader","Tatooine","42.BBY","/icons/Sith/Dvader.jpg")
            .lightsaberColor(LightsaberColor.RED)
            .power(34)
            .agility(3)
            .precision(7)
            .honor(8)
            .level(32)
            .build();  //BYB significa Before Yavin Battle

    @Test
    public void shouldgetSithName() throws Exception {
         Assert.assertEquals("Darth Vader",darth_vader.getName());
    }

    @Test
    public void shouldGetSithBirthPlanet() throws Exception {
        Assert.assertEquals("Tatooine",darth_vader.getBirthPlanet());
    }

    @Test
    public void shouldGetSithBirthDate() throws Exception {
        Assert.assertEquals("42.BBY",darth_vader.getBirthDate());
    }

    @Test
    public void shouldGetSithLightsaberColor() throws Exception {   //Tive que criar uma variável do tipo LightsaberColor e atribuir a cor para o teste, pois estava dando erro de incompatibilidade de tipos
        LightsaberColor teste = LightsaberColor.RED;
        Assert.assertEquals(teste,darth_vader.getLightsaberColor());

    }
    @Test
    public void shouldGetSithPower() throws Exception {
        Assert.assertEquals(34,darth_vader.getPower());
    }

    @Test
    public void shouldGetSithAgility() throws Exception {
        Assert.assertEquals(3,darth_vader.getAgility());
    }

    @Test
    public void shouldGetSithPrecision() throws Exception {
        Assert.assertEquals(7,darth_vader.getPrecision());
    }

    @Test
    public void shouldGetSithHonor() throws Exception {
        Assert.assertEquals(8,darth_vader.getHonor());
    }

    @Test
    public void shouldGetSithLevel() throws Exception {
        Assert.assertEquals(32,darth_vader.getLevel());
    }

    @Test
    public void shouldGetSithResourceImage() throws Exception {   //Testando se a imagem foi carregada corretamente(É melhor fazer isto na main)
        Assert.assertEquals("/icons/Sith/Dvader.jpg",darth_vader.getResourceImage());
    }
}
