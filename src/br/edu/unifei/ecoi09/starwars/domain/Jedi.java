package br.edu.unifei.ecoi09.starwars.domain;

import javax.swing.*;

public class Jedi {
    //Variáveis de identificação(serão usadas para informar sobre o personagem)
    protected String name; //Recebe o nome do personagem
    protected String birthPlanet;//Recebe o nome do planeta de origem
    private String birthDate;
    protected LightsaberColor lightsaberColor;//Recebe a cor da light saber
    protected ImageIcon icon;//Armazena a imagem recebida do personagem
    private String resourceImage;//Recebe a localização da imagem associada ao personagem
    //add aqui mais info se necessário...


    //Variáveis de combate(Serão utilizadas na hora do duelo de cartas)
    protected int force;
    protected int velocity;
    protected int hability;
    protected int experience;
    protected int level;
    //add aqui mais variáveis caso precise...

    public Jedi(String name, String birthPlanet, String birthDate, String resourceImage){    //A variável resource deve receber o diretório da imaagem
        this.name = name;
        this.birthPlanet = birthPlanet;
        this.setBirthDate(birthDate);
        this.lightsaberColor = LightsaberColor.NEUTRAL;
        this.force = 0;
        this.velocity = 0;
        this.hability = 0;
        this.experience = 0;
        this.level = 0;
        this.resourceImage = resourceImage;
        this.icon = new ImageIcon(getClass().getResource(resourceImage));//escrever aqui o procedimento para adicionar a imagem do personagem Tomar cuidado na hora que for trocar o resourceImage
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthPlanet() {
        return birthPlanet;
    }

    public void setBirthPlanet(String planet) {
        this.birthPlanet = planet;
    }

    public LightsaberColor getLightsaberColor() {
        return lightsaberColor;
    }

    public void setLightsaberColor(LightsaberColor lightsaberColor) {
        this.lightsaberColor = lightsaberColor;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getHability() {
        return hability;
    }

    public void setHability(int hability) {
        this.hability = hability;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getResourceImage() {
        return resourceImage;
    }

    public void setResourceImage(String resourceImage) {
        this.resourceImage = resourceImage;
    }
}
