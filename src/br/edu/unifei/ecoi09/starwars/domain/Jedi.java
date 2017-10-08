package br.edu.unifei.ecoi09.starwars.domain;

import javax.swing.*;

public class Jedi {
    //Variáveis de identificação(serão usadas para informar sobre o personagem)
    protected String name; //Recebe o nome do personagem
    protected String birthPlanet;//Recebe o nome do planeta de origem
    private String birthDate;
    protected LightsaberColor lightsaberColor;//Recebe a cor da light saber
    private String resourceImage;//Recebe a localização da imagem associada ao personagem
    //add aqui mais info se necessário...


    //Variáveis de combate(Serão utilizadas na hora do duelo de cartas)
    protected int power;
    protected int agility;
    protected int precision;
    protected int honor;
    protected int level;
    //add aqui mais variáveis caso precise...

    public Jedi(String name, String birthPlanet, String birthDate, String resourceImage){    //A variável resource deve receber o diretório da imaagem
        this.name = name;
        this.birthPlanet = birthPlanet;
        this.setBirthDate(birthDate);
        this.lightsaberColor = LightsaberColor.NEUTRAL;
        this.power = 0;
        this.agility = 0;
        this.precision = 0;
        this.honor = 0;
        this.level = 0;
        this.resourceImage = resourceImage;
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
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
