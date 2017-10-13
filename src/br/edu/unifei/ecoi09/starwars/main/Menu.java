package br.edu.unifei.ecoi09.starwars.main;

import br.edu.unifei.ecoi09.starwars.database.Database;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JPanel implements ActionListener {

    JButton start = new JButton();
    JButton quit = new JButton();

    public Menu() {
        setLayout( new BoxLayout( this, BoxLayout.Y_AXIS ) );
        add( Box.createVerticalStrut( 280 ) );
        add( Box.createVerticalGlue() );


        // "Zerar" Layout
        setLayout( null );


        // Criacçao dos Botoes no menu


        start.setBounds( 320, 350, 400, 90 );
        start.setVisible( true );
        start.addActionListener( this ); // Iniciar Jogo
        start.setContentAreaFilled( false );
        start.setBorderPainted( false );
        add( start );

        quit.setBounds( 430, 590, 190, 85 );
        quit.setVisible( true );
        quit.setContentAreaFilled( false );
        quit.setBorderPainted( false );
        quit.addActionListener( this ); // funcao de sair
        add( quit );
}

    public void actionPerformed(ActionEvent game) {
        Object obj = game.getSource();
        if (obj == start) {
                Database data = new Database();
                data.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
                data.setSize( 1000, 1000 );
                data.setVisible( true );

        }
        if (obj == quit) {
            System.exit( 0 );
        }

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent( g );
        g.drawImage( new ImageIcon( Menu.class.getResource( "Menu1.jpeg" ) ).getImage(), 0, 0, 1080, 720, this );

    }


}
