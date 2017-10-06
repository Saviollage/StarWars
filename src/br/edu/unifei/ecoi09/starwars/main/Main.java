package br.edu.unifei.ecoi09.starwars.main;

import br.edu.unifei.ecoi09.starwars.domain.Sith;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Sith.SithBuilder darth_vader = new Sith.SithBuilder("Darth Vader","Tatooine","42.BBY","/icons/Dvader.jpeg");
        JLabel label = new JLabel("what is this",darth_vader.getIcon(),JLabel.CENTER);
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
