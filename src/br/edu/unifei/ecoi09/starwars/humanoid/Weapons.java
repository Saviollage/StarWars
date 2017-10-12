package br.edu.unifei.ecoi09.starwars.humanoid;

public enum Weapons {
    NONE("None"),
    PISTOLS ("Pistols"),    //Pode ser substituído pelo código de cores
    MACHINE_GUNS ("Machine Guns"),
    KNIFE("Knife"),
    SPADES("Spades"),
    BLUE_MASTER("Blue Master"),
    GREEN("Green"),
    BLURGG_1120("Blurgg=1120"),
    BOWCASTER("Bowcaster"),
    EE3_CARBINE_RIFLE("EE3 Carbine Rigle"),
    RAPID_FIRE_BLASTERS("Rapid Fire Blasters"),
    E11_SEMI_AUTO("E11 Semi-Auto"),
    DL_44_PISTOLS("DL 44 Pistols");
    //Adicionar aqui mais cores de lightsabers...

    public String description;
    Weapons(String description){
        this.description = description;
    }
}
