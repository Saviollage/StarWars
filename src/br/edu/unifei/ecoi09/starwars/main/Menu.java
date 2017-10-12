package br.edu.unifei.ecoi09.starwars.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Menu extends JPanel implements MouseListener {



    public Menu() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(Box.createVerticalStrut(280));
        add(Box.createVerticalGlue());

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(new ImageIcon(Menu.class.getResource("Menu.jpg")).getImage(),0,0,1080,720,this);

    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        int mx = e.getX();
        int my = e.getY();

        //Menu area X
        if (mx >= 565 && mx <= 1280) {
            if (my >= 555 && my <= 690)     // Start game area
            {

            }
            else if (my >= 700 && my <= 845) // Help area
            {

            }
            else if (my >= 865 && my <= 1020)  //Quit area
            {

            }

        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


}
