package br.edu.unifei.ecoi09.starwars.domain;

public enum LightsaberColor {
    NEUTRAL("Neutral"),
    BLUE ("Blue"),    //Pode ser substituído pelo código de cores
    RED ("Red"),
    GREEN("Green");
    //Adicionar aqui mais cores de lightsabers...

    public String description;
    LightsaberColor(String description){
        this.description = description;
    }
}
