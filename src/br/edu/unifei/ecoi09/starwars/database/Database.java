package br.edu.unifei.ecoi09.starwars.database;

import br.edu.unifei.ecoi09.starwars.domain.*;
import br.edu.unifei.ecoi09.starwars.humanoid.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Database extends JFrame{
    JediMaster yoda = new JediMaster.JediMasterBuilder("Yoda","Desconhecido","900.BBE","/br/edu/unifei/ecoi09/starwars/icons/Jedi/Yoda.jpg")
            .lightsaberColor(LightsaberColor.BLUE_MASTER)
            .power(26)
            .agility(10)
            .precision(30)
            .honor(40)
            .level(60)
            .build();  //BYB significa Before Yavin Battle

    Sith darth_vader = new Sith.SithBuilder("Darth Vader","Tatooine",
            "41.9 BBY","/br/edu/unifei/ecoi09/starwars/icons/Darth-Vader.jpeg")
            .lightsaberColor(LightsaberColor.RED)
            .power(50)
            .agility(56)
            .precision(60)
            .honor(0)
            .level(45)
            .build();  //BYB significa Before Yavin Battle

    Human anakin = new Human.HumanBuilder("Anakin Skywalker","Tatooine",
            "41.9 BBY","/br/edu/unifei/ecoi09/starwars/icons/Jedi/Anakin_Skywalker_slave.jpg")
            .weapons(Weapons.NONE)
            .power(12)
            .agility(21)
            .precision(40)
            .honor(10)
            .level(10)
            .build();  //BYB significa Before Yavin Battle

    Padawan anakin2 = new Padawan.PadawanBuilder("Anakin Skywalker","Tatooine","41.9 BBY",
            "/br/edu/unifei/ecoi09/starwars/icons/Jedi/anakin-padawan.jpg")
            .lightsaberColor(LightsaberColor.BLUE)
            .power(24)
            .agility(31)
            .precision(40)
            .honor(20)
            .level(15)
            .build();  //BYB significa Before Yavin Battle

    JediKnight obi = new JediKnight.JediKnightBuilder("Obi-Wan Kenobi","Stewjon",
            "57 ABY","/br/edu/unifei/ecoi09/starwars/icons/Jedi/Obi-wan.jpg")
            .lightsaberColor(LightsaberColor.BLUE)
            .power(45)
            .agility(45)
            .precision(40)
            .honor(50)
            .level(30)
            .build();  //BYB significa Before Yavin Battle

    JediKnight qui_gon_jinn = new JediKnight.JediKnightBuilder("Qui-Gon Jinn","Coruscant",
            "92 BBY","/br/edu/unifei/ecoi09/starwars/icons/Jedi/QuiGonJinn.png")
            .lightsaberColor(LightsaberColor.GREEN)
            .power(55)
            .agility(55)
            .precision(50)
            .honor(60)
            .level(38)
            .build();  //BYB significa Before Yavin Battle

    Wookie chewi = new Wookie.WookieBuilder("Chewbacca","Kashyyyk",
            "180 ABY","/br/edu/unifei/ecoi09/starwars/icons/chewie.jpeg")
            .weapons(Weapons.BOWCASTER)
            .power(32)
            .agility(40)
            .precision(12)
            .honor(5)
            .level(44)
            .build();  //BYB significa Before Yavin Battle

    Human boba = new Human.HumanBuilder("Boba Fett","Kamino",
            "Shortly ABN","/br/edu/unifei/ecoi09/starwars/icons/Boba-Fett.jpeg")
            .weapons(Weapons.EE3_CARBINE_RIFLE)
            .power(20)
            .agility(30)
            .precision(50)
            .honor(20)
            .level(35)
            .build();  //BYB significa Before Yavin Battle

    Gungan jarjar = new Gungan.GunganBuilder("Jar Jar Binks","Naboo",
            "Desconhecido","/br/edu/unifei/ecoi09/starwars/icons/Jar_jar_binks.jpeg")
            .weapons(Weapons.NONE)
            .power(10)
            .agility(5)
            .precision(13)
            .honor(40)
            .level(12)
            .build();  //BYB significa Before Yavin Battle

    Hutt jabba = new Hutt.HuttBuilder("Jabba Desilijic Tiure","Tatooine",
            "600 ABY","/br/edu/unifei/ecoi09/starwars/icons/Jabba-The-Hutt.jpeg")
            .weapons(Weapons.NONE)
            .power(60)
            .agility(60)
            .precision(70)
            .honor(70)
            .level(80)
            .build();  //BYB significa Before Yavin Battle

    Twilek hera = new Twilek.TwilekBuilder("Hera Syndulla","Ryloth",
            "29 ABY","/br/edu/unifei/ecoi09/starwars/icons/Hera_Syndulla.png")
            .weapons(Weapons.BLURGG_1120)
            .power(30)
            .agility(23)
            .precision(30)
            .honor(20)
            .level(15)
            .build();  //BYB significa Before Yavin Battle

    Human storm = new Human.HumanBuilder("Stormtrooper","Galactic Emperor",
            "19 BBY","/br/edu/unifei/ecoi09/starwars/icons/Stormtrooper.jpeg")
            .weapons(Weapons.RAPID_FIRE_BLASTERS)
            .power(30)
            .agility(30)
            .precision(50)
            .honor(50)
            .level(50)
            .build();  //BYB significa Before Yavin Battle

    Human padme = new Human.HumanBuilder("Padmé Amidala Naberrie","Naboo",
            "46 ABY","/br/edu/unifei/ecoi09/starwars/icons/Padmegreenscrshot.jpg")
            .weapons(Weapons.NONE)
            .power(20)
            .agility(20)
            .precision(30)
            .honor(100)
            .level(20)
            .build();  //BYB significa Before Yavin Battle

    Human leia = new Human.HumanBuilder("Leia Organa","Alderaan",
            "19 ABY","/br/edu/unifei/ecoi09/starwars/icons/Jedi/Leia.jpg")
            .weapons(Weapons.E11_SEMI_AUTO)
            .power(30)
            .agility(40)
            .precision(50)
            .honor(80)
            .level(30)
            .build();  //BYB significa Before Yavin Battle

    JediMaster luke = new JediMaster.JediMasterBuilder("Luke Skywalker","Tattoine",
            "19 ABY","/br/edu/unifei/ecoi09/starwars/icons/Jedi/Luke-skywalker.jpg")
            .lightsaberColor(LightsaberColor.GREEN_MASTER)
            .power(55)
            .agility(60)
            .precision(60)
            .honor(80)
            .level(60)
            .build();  //BYB significa Before Yavin Battle

    JediMaster aylaa = new JediMaster.JediMasterBuilder("Aayla Secura","Ryloth",
            "Desconhecido","/br/edu/unifei/ecoi09/starwars/icons/Aayla.jpg")
            .lightsaberColor(LightsaberColor.BLUE_MASTER)
            .power(45)
            .agility(30)
            .precision(20)
            .honor(30)
            .level(20)
            .build();  //BYB significa Before Yavin Battle

    Human han = new Human.HumanBuilder("Han Solo","Corellia",
            "19 BBY","/br/edu/unifei/ecoi09/starwars/icons/Han-Solo.jpg")
            .weapons(Weapons.DL_44_PISTOLS)
            .power(40)
            .agility(30)
            .precision(80)
            .honor(5)
            .level(20)
            .build();  //BYB significa Before Yavin Battle

    Sith sidius = new Sith.SithBuilder("Darth Sidius","Naboo",
            "84 BBY","/br/edu/unifei/ecoi09/starwars/icons/Sith/Palpatine.jpg")
            .lightsaberColor(LightsaberColor.RED)
            .power(90)
            .agility(85)
            .precision(76)
            .honor(30)
            .level(85)
            .build();  //BYB significa Before Yavin Battle

    Sith maul = new Sith.SithBuilder("Darth Maul","Dathomir",
            "Desconhecido","/br/edu/unifei/ecoi09/starwars/icons/Sith/Darth_maul.jpg")
            .lightsaberColor(LightsaberColor.RED)
            .power(80)
            .agility(75)
            .precision(70)
            .honor(15)
            .level(56)
            .build();  //BYB significa Before Yavin Battle

    Sith kyle = new Sith.SithBuilder("Kylo Ren","Chandrila",
            "5 DBY","/br/edu/unifei/ecoi09/starwars/icons/Kylo-ren.jpeg")
            .lightsaberColor(LightsaberColor.RED)
            .power(40)
            .agility(30)
            .precision(50)
            .honor(0)
            .level(35)
            .build();  //BYB significa Before Yavin Battle

    JediMaster mace = new JediMaster.JediMasterBuilder("Mace Windu","Haruun Kal",
            "Desconhecido","/br/edu/unifei/ecoi09/starwars/icons/Jedi/Mace_Windu.jpg")
            .lightsaberColor(LightsaberColor.PURPLE_MASTER)
            .power(50)
            .agility(60)
            .precision(70)
            .honor(80)
            .level(60)
            .build();  //BYB significa Before Yavin Battle


    private JButton[] botoes;
    private Container container;
    private GridLayout gridLayout;
    public Database(){
        super("Database of the Star wars characters");
        gridLayout = new GridLayout(5,5,10,10);
        container = getContentPane();
        setLayout(gridLayout);
        botoes = new JButton[25];
        botoes[0] = new JButton("yoda");
        botoes[0].setIcon(new ImageIcon(getClass().getResource(yoda.getResourceImage())));
        botoes[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Name: "+ yoda.getName()+'\n'
                        +"Birth Planet: "+yoda.getBirthPlanet()+'\n'
                        +"Birth Date: "+yoda.getBirthDate()+'\n'
                        +"Lightsaber Color: "+ yoda.getLightsaberColor()+'\n'
                        +"Power "+yoda.getPower()+'\n'
                        +"Agility: "+yoda.getAgility()+'\n'
                        +"Precision: "+yoda.getPrecision()+'\n'
                        +"Honor: "+yoda.getHonor()+'\n'
                        +"Level: "+yoda.getLevel()+'\n');
            }
        });

        botoes[1] = new JButton("darth_vader");
        botoes[1].setIcon(new ImageIcon(getClass().getResource(darth_vader.getResourceImage())));
        botoes[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Name: "+ darth_vader.getName()+'\n'
                        +"Birth Planet: "+darth_vader.getBirthPlanet()+'\n'
                        +"Birth Date: "+darth_vader.getBirthDate()+'\n'
                        +"Lightsaber Color: "+ darth_vader.getLightsaberColor()+'\n'
                        +"Power "+darth_vader.getPower()+'\n'
                        +"Agility: "+darth_vader.getAgility()+'\n'
                        +"Precision: "+darth_vader.getPrecision()+'\n'
                        +"Honor: "+darth_vader.getHonor()+'\n'
                        +"Level: "+darth_vader.getLevel()+'\n');
            }
        });


        botoes[2] = new JButton("anakin");
        botoes[2].setIcon(new ImageIcon(getClass().getResource(anakin.getResourceImage())));
        botoes[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Name: "+ anakin.getName()+'\n'
                        +"Birth Planet: "+anakin.getBirthPlanet()+'\n'
                        +"Birth Date: "+anakin.getBirthDate()+'\n'
                        +"Weapons: "+ anakin.getWeapons()+'\n'
                        +"Power "+anakin.getPower()+'\n'
                        +"Agility: "+anakin.getAgility()+'\n'
                        +"Precision: "+anakin.getPrecision()+'\n'
                        +"Honor: "+anakin.getHonor()+'\n'
                        +"Level: "+anakin.getLevel()+'\n');
            }
        });

        botoes[3] = new JButton("anakin2");
        botoes[3].setIcon(new ImageIcon(getClass().getResource(anakin2.getResourceImage())));
        botoes[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Name: "+ anakin2.getName()+'\n'
                        +"Birth Planet: "+anakin2.getBirthPlanet()+'\n'
                        +"Birth Date: "+anakin2.getBirthDate()+'\n'
                        +"Lightsaber Color: "+ anakin2.getLightsaberColor()+'\n'
                        +"Power "+anakin2.getPower()+'\n'
                        +"Agility: "+anakin2.getAgility()+'\n'
                        +"Precision: "+anakin2.getPrecision()+'\n'
                        +"Honor: "+anakin2.getHonor()+'\n'
                        +"Level: "+anakin2.getLevel()+'\n');
            }
        });

        botoes[4] = new JButton("obi");
        botoes[4].setIcon(new ImageIcon(getClass().getResource(obi.getResourceImage())));
        botoes[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Name: "+ obi.getName()+'\n'
                        +"Birth Planet: "+obi.getBirthPlanet()+'\n'
                        +"Birth Date: "+obi.getBirthDate()+'\n'
                        +"Lightsaber Color: "+ obi.getLightsaberColor()+'\n'
                        +"Power "+obi.getPower()+'\n'
                        +"Agility: "+obi.getAgility()+'\n'
                        +"Precision: "+obi.getPrecision()+'\n'
                        +"Honor: "+obi.getHonor()+'\n'
                        +"Level: "+obi.getLevel()+'\n');
            }
        });

        botoes[5] = new JButton("qui");
        botoes[5].setIcon(new ImageIcon(getClass().getResource(qui_gon_jinn.getResourceImage())));
        botoes[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Name: "+ qui_gon_jinn.getName()+'\n'
                        +"Birth Planet: "+qui_gon_jinn.getBirthPlanet()+'\n'
                        +"Birth Date: "+qui_gon_jinn.getBirthDate()+'\n'
                        +"Lightsaber Color: "+ qui_gon_jinn.getLightsaberColor()+'\n'
                        +"Power "+qui_gon_jinn.getPower()+'\n'
                        +"Agility: "+qui_gon_jinn.getAgility()+'\n'
                        +"Precision: "+qui_gon_jinn.getPrecision()+'\n'
                        +"Honor: "+qui_gon_jinn.getHonor()+'\n'
                        +"Level: "+qui_gon_jinn.getLevel()+'\n');
            }
        });

        botoes[6] = new JButton("chewiw");
        botoes[6].setIcon(new ImageIcon(getClass().getResource(chewi.getResourceImage())));
        botoes[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Name: "+ chewi.getName()+'\n'
                        +"Birth Planet: "+chewi.getBirthPlanet()+'\n'
                        +"Birth Date: "+chewi.getBirthDate()+'\n'
                        +"Weapons: "+ chewi.getWeapons()+'\n'
                        +"Power "+chewi.getPower()+'\n'
                        +"Agility: "+chewi.getAgility()+'\n'
                        +"Precision: "+chewi.getPrecision()+'\n'
                        +"Honor: "+chewi.getHonor()+'\n'
                        +"Level: "+chewi.getLevel()+'\n');
            }
        });

        botoes[7] = new JButton("boba");
        botoes[7].setIcon(new ImageIcon(getClass().getResource(boba.getResourceImage())));
        botoes[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Name: "+ boba.getName()+'\n'
                        +"Birth Planet: "+boba.getBirthPlanet()+'\n'
                        +"Birth Date: "+boba.getBirthDate()+'\n'
                        +"Weapons: "+ boba.getWeapons()+'\n'
                        +"Power "+boba.getPower()+'\n'
                        +"Agility: "+boba.getAgility()+'\n'
                        +"Precision: "+boba.getPrecision()+'\n'
                        +"Honor: "+boba.getHonor()+'\n'
                        +"Level: "+boba.getLevel()+'\n');
            }
        });

        botoes[8] = new JButton("jarjar");
        botoes[8].setIcon(new ImageIcon(getClass().getResource(jarjar.getResourceImage())));
        botoes[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Name: "+ jarjar.getName()+'\n'
                        +"Birth Planet: "+jarjar.getBirthPlanet()+'\n'
                        +"Birth Date: "+jarjar.getBirthDate()+'\n'
                        +"Weapons: "+ jarjar.getWeapons()+'\n'
                        +"Power "+jarjar.getPower()+'\n'
                        +"Agility: "+jarjar.getAgility()+'\n'
                        +"Precision: "+jarjar.getPrecision()+'\n'
                        +"Honor: "+jarjar.getHonor()+'\n'
                        +"Level: "+jarjar.getLevel()+'\n');
            }
        });

        botoes[9] = new JButton("jabba");
        botoes[9].setIcon(new ImageIcon(getClass().getResource(jabba.getResourceImage())));
        botoes[9].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Name: "+ jabba.getName()+'\n'
                        +"Birth Planet: "+jabba.getBirthPlanet()+'\n'
                        +"Birth Date: "+jabba.getBirthDate()+'\n'
                        +"Weapons: "+ jabba.getWeapons()+'\n'
                        +"Power "+jabba.getPower()+'\n'
                        +"Agility: "+jabba.getAgility()+'\n'
                        +"Precision: "+jabba.getPrecision()+'\n'
                        +"Honor: "+jabba.getHonor()+'\n'
                        +"Level: "+jabba.getLevel()+'\n');
            }
        });

        botoes[10] = new JButton("jabba");
        botoes[10].setIcon(new ImageIcon(getClass().getResource(hera.getResourceImage())));
        botoes[10].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Name: "+ hera.getName()+'\n'
                        +"Birth Planet: "+hera.getBirthPlanet()+'\n'
                        +"Birth Date: "+hera.getBirthDate()+'\n'
                        +"Weapons: "+ hera.getWeapons()+'\n'
                        +"Power "+hera.getPower()+'\n'
                        +"Agility: "+hera.getAgility()+'\n'
                        +"Precision: "+hera.getPrecision()+'\n'
                        +"Honor: "+hera.getHonor()+'\n'
                        +"Level: "+hera.getLevel()+'\n');
            }
        });

        botoes[11] = new JButton("storm");
        botoes[11].setIcon(new ImageIcon(getClass().getResource(storm.getResourceImage())));
        botoes[11].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Name: "+ storm.getName()+'\n'
                        +"Birth Planet: "+storm.getBirthPlanet()+'\n'
                        +"Birth Date: "+storm.getBirthDate()+'\n'
                        +"Weapons: "+ storm.getWeapons()+'\n'
                        +"Power "+storm.getPower()+'\n'
                        +"Agility: "+storm.getAgility()+'\n'
                        +"Precision: "+storm.getPrecision()+'\n'
                        +"Honor: "+storm.getHonor()+'\n'
                        +"Level: "+storm.getLevel()+'\n');
            }
        });

        botoes[12] = new JButton("padme");
        botoes[12].setIcon(new ImageIcon(getClass().getResource(padme.getResourceImage())));
        botoes[12].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Name: "+ padme.getName()+'\n'
                        +"Birth Planet: "+padme.getBirthPlanet()+'\n'
                        +"Birth Date: "+padme.getBirthDate()+'\n'
                        +"Weapons: "+ padme.getWeapons()+'\n'
                        +"Power "+padme.getPower()+'\n'
                        +"Agility: "+padme.getAgility()+'\n'
                        +"Precision: "+padme.getPrecision()+'\n'
                        +"Honor: "+padme.getHonor()+'\n'
                        +"Level: "+padme.getLevel()+'\n');
            }
        });

        botoes[13] = new JButton("leia");
        botoes[13].setIcon(new ImageIcon(getClass().getResource(leia.getResourceImage())));
        botoes[13].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Name: "+ leia.getName()+'\n'
                        +"Birth Planet: "+leia.getBirthPlanet()+'\n'
                        +"Birth Date: "+leia.getBirthDate()+'\n'
                        +"Weapons: "+ leia.getWeapons()+'\n'
                        +"Power "+leia.getPower()+'\n'
                        +"Agility: "+leia.getAgility()+'\n'
                        +"Precision: "+leia.getPrecision()+'\n'
                        +"Honor: "+leia.getHonor()+'\n'
                        +"Level: "+leia.getLevel()+'\n');
            }
        });

        botoes[14] = new JButton("luke");
        botoes[14].setIcon(new ImageIcon(getClass().getResource(luke.getResourceImage())));
        botoes[14].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Name: "+ luke.getName()+'\n'
                        +"Birth Planet: "+luke.getBirthPlanet()+'\n'
                        +"Birth Date: "+luke.getBirthDate()+'\n'
                        +"Lightsaber Color: "+ luke.getLightsaberColor()+'\n'
                        +"Power "+luke.getPower()+'\n'
                        +"Agility: "+luke.getAgility()+'\n'
                        +"Precision: "+luke.getPrecision()+'\n'
                        +"Honor: "+luke.getHonor()+'\n'
                        +"Level: "+luke.getLevel()+'\n');
            }
        });

        botoes[15] = new JButton("aylaa");
        botoes[15].setIcon(new ImageIcon(getClass().getResource(aylaa.getResourceImage())));
        botoes[15].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Name: "+ aylaa.getName()+'\n'
                        +"Birth Planet: "+aylaa.getBirthPlanet()+'\n'
                        +"Birth Date: "+aylaa.getBirthDate()+'\n'
                        +"Lightsaber Color: "+ aylaa.getLightsaberColor()+'\n'
                        +"Power "+aylaa.getPower()+'\n'
                        +"Agility: "+aylaa.getAgility()+'\n'
                        +"Precision: "+aylaa.getPrecision()+'\n'
                        +"Honor: "+aylaa.getHonor()+'\n'
                        +"Level: "+aylaa.getLevel()+'\n');
            }
        });

        botoes[16] = new JButton("han");
        botoes[16].setIcon(new ImageIcon(getClass().getResource(han.getResourceImage())));
        botoes[16].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Name: "+ han.getName()+'\n'
                        +"Birth Planet: "+han.getBirthPlanet()+'\n'
                        +"Birth Date: "+han.getBirthDate()+'\n'
                        +"Weapons: "+ han.getWeapons()+'\n'
                        +"Power "+han.getPower()+'\n'
                        +"Agility: "+han.getAgility()+'\n'
                        +"Precision: "+han.getPrecision()+'\n'
                        +"Honor: "+han.getHonor()+'\n'
                        +"Level: "+han.getLevel()+'\n');
            }
        });

        botoes[18] = new JButton("maul");
        botoes[18].setIcon(new ImageIcon(getClass().getResource(maul.getResourceImage())));
        botoes[18].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Name: "+ maul.getName()+'\n'
                        +"Birth Planet: "+maul.getBirthPlanet()+'\n'
                        +"Birth Date: "+maul.getBirthDate()+'\n'
                        +"Lightsaber Color: "+ maul.getLightsaberColor()+'\n'
                        +"Power "+maul.getPower()+'\n'
                        +"Agility: "+maul.getAgility()+'\n'
                        +"Precision: "+maul.getPrecision()+'\n'
                        +"Honor: "+maul.getHonor()+'\n'
                        +"Level: "+maul.getLevel()+'\n');
            }
        });

        botoes[15] = new JButton("aylaa");
        botoes[15].setIcon(new ImageIcon(getClass().getResource(aylaa.getResourceImage())));
        botoes[15].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Name: "+ aylaa.getName()+'\n'
                        +"Birth Planet: "+aylaa.getBirthPlanet()+'\n'
                        +"Birth Date: "+aylaa.getBirthDate()+'\n'
                        +"Lightsaber Color: "+ aylaa.getLightsaberColor()+'\n'
                        +"Power "+aylaa.getPower()+'\n'
                        +"Agility: "+aylaa.getAgility()+'\n'
                        +"Precision: "+aylaa.getPrecision()+'\n'
                        +"Honor: "+aylaa.getHonor()+'\n'
                        +"Level: "+aylaa.getLevel()+'\n');
            }
        });

        botoes[19] = new JButton("kyle");
        botoes[19].setIcon(new ImageIcon(getClass().getResource(kyle.getResourceImage())));
        botoes[19].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Name: "+ kyle.getName()+'\n'
                        +"Birth Planet: "+kyle.getBirthPlanet()+'\n'
                        +"Birth Date: "+kyle.getBirthDate()+'\n'
                        +"Lightsaber Color: "+ kyle.getLightsaberColor()+'\n'
                        +"Power "+kyle.getPower()+'\n'
                        +"Agility: "+kyle.getAgility()+'\n'
                        +"Precision: "+kyle.getPrecision()+'\n'
                        +"Honor: "+kyle.getHonor()+'\n'
                        +"Level: "+kyle.getLevel()+'\n');
            }
        });

        botoes[20] = new JButton("mace");
        botoes[20].setIcon(new ImageIcon(getClass().getResource(mace.getResourceImage())));
        botoes[20].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null,"Name: "+ mace.getName()+'\n'
                        +"Birth Planet: "+mace.getBirthPlanet()+'\n'
                        +"Birth Date: "+mace.getBirthDate()+'\n'
                        +"Lightsaber Color: "+ mace.getLightsaberColor()+'\n'
                        +"Power "+mace.getPower()+'\n'
                        +"Agility: "+mace.getAgility()+'\n'
                        +"Precision: "+mace.getPrecision()+'\n'
                        +"Honor: "+mace.getHonor()+'\n'
                        +"Level: "+mace.getLevel()+'\n');
            }
        });

        add(botoes[0]);
        add(botoes[1]);
        add(botoes[2]);
        add(botoes[3]);
        add(botoes[4]);
        add(botoes[5]);
        add(botoes[6]);
        add(botoes[7]);
        add(botoes[8]);
        add(botoes[9]);
        add(botoes[10]);
        add(botoes[11]);
        add(botoes[12]);
        add(botoes[13]);
        add(botoes[14]);
        add(botoes[15]);
        add(botoes[16]);
        //add(botoes[17]);  O limite do container excedeu, por tanto não deu para adicionar mais personagens na grade
        //add(botoes[18]);
        //add(botoes[19]);
      //  add(botoes[20]);
    }
}
