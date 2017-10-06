import br.edu.unifei.ecoi09.starwars.domain.LightsaberColor;
import br.edu.unifei.ecoi09.starwars.domain.Sith;
import org.junit.Assert;
import org.junit.Test;

import javax.swing.*;
import java.awt.*;

public class SithTest extends JPanel{
    Sith darth_vader = new Sith.SithBuilder("Darth Vader","Tatooine","42.BBY","/icons/Dvader.jpeg")
            .lightsaberColor(LightsaberColor.RED)
            .force(34)
            .velocity(3)
            .hability(7)
            .experience(8)
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
    public void shouldGetSithForce() throws Exception {
        Assert.assertEquals(34,darth_vader.getForce());
    }

    @Test
    public void shouldGetSithVelocity() throws Exception {
        Assert.assertEquals(3,darth_vader.getVelocity());
    }

    @Test
    public void shouldGetSithHability() throws Exception {
        Assert.assertEquals(7,darth_vader.getHability());
    }

    @Test
    public void shouldGetSithExperience() throws Exception {
        Assert.assertEquals(8,darth_vader.getExperience());
    }

    @Test
    public void shouldGetSithLevel() throws Exception {
        Assert.assertEquals(32,darth_vader.getLevel());
    }

    @Test
    public void shouldGetSithResourceImage() throws Exception {   //Testando se a imagem foi carregada corretamente(É melhor fazer isto na main)
        Assert.assertEquals("/icons/Dvader.jpeg",darth_vader.getResourceImage());
        JLabel label = new JLabel("Um texto de teste",darth_vader.getIcon(),JLabel.CENTER);
        JPanel pane1 = new JPanel(new BorderLayout());
        pane1.add(label,BorderLayout.CENTER);
        JFrame tela = new JFrame();
        tela.setLayout(new FlowLayout());
        tela.setSize(200,300);
        tela.add(pane1);
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
