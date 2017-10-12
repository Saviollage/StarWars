package br.edu.unifei.ecoi09.starwars.main;
import br.edu.unifei.ecoi09.starwars.database.Database;

import javax.swing.*;

public class Main extends JFrame {

    public static void main(String[] args) {

        Database test =  new Database();
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setSize(1000,1000);
        test.setVisible(true);

        /* setTitle("STAR WARS GAME");

        setSize(1080, 700);
        setResizable(false);


        Menu menu = new Menu();
        add(menu);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }*/
    }
}