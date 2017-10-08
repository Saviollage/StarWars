package br.edu.unifei.ecoi09.starwars.domain;

public enum LightsaberColor {
    NEUTRAL("Neutral"),
    BLUE ("Blue"),    //Pode ser substituído pelo código de cores
    RED ("Red"),
    BLUE_KNIGHT("Blue Knight"),
    BLUE_PADAWAN("Blue Padawan"),
    BLUE_MASTER("Blue Master"),
    GREEN("Green");
    //Adicionar aqui mais cores de lightsabers...

    public String description;
    LightsaberColor(String description){
        this.description = description;
    }
}
