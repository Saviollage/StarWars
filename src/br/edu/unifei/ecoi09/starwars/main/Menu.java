package br.edu.unifei.ecoi09.starwars.main;

import br.edu.unifei.ecoi09.starwars.database.Database;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JPanel implements ActionListener {

    JButton start = new JButton();
    JButton help = new JButton();
    JButton quit = new JButton();

    public Menu() {
        setLayout( new BoxLayout( this, BoxLayout.Y_AXIS ) );
        add( Box.createVerticalStrut( 280 ) );
        add( Box.createVerticalGlue() );


        // "Zerar" Layout
        setLayout( null );


        // Criacçao dos Botoes do menu inicial


        start.setBounds( 320, 350, 400, 90 );
        start.setVisible( true );
        start.addActionListener( this ); // Iniciar Jogo
        start.setContentAreaFilled( false );
        start.setBorderPainted( false );
        add( start );

        help.setBounds( 430, 470, 190, 90 );
        help.setVisible( true );
        help.setContentAreaFilled( false );
        help.setBorderPainted( false );
        help.addActionListener( this );  // abrir JPAnel com Ajuda
        add( help );

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
                Database test = new Database();
                test.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
                test.setSize( 1000, 1000 );
                test.setVisible( true );

        }
        if (obj == help) {
            JOptionPane.showMessageDialog( null, "Iniciar :"  +
                    "Para iniciar o jogo clique em Start Game" );//Texto de ajuda //
        }
        if (obj == quit) {
            System.exit( 0 );
        }

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent( g );
        g.drawImage( new ImageIcon( Menu.class.getResource( "Menu.jpg" ) ).getImage(), 0, 0, 1080, 720, this );

    }


}
