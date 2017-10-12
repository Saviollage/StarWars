package br.edu.unifei.ecoi09.starwars.main;


import javax.swing.*;

public class Main extends JFrame {

    public Main() {
        setTitle("STAR WARS GAME");

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
    }
}