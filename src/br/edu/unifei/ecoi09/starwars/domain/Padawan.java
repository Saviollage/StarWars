package br.edu.unifei.ecoi09.starwars.domain;

public class Padawan extends Jedi {
    private Padawan(Padawan.PadawanBuilder padawanBuilder) {
        super(padawanBuilder.getName(), padawanBuilder.getBirthPlanet(), padawanBuilder.getBirthDate(),padawanBuilder.getResourceImage());
        this.name = padawanBuilder.getName();
        this.birthPlanet = padawanBuilder.getBirthPlanet();
        this.lightsaberColor = padawanBuilder.getLightsaberColor();
        this.power = padawanBuilder.getPower();
        this.agility = padawanBuilder.getAgility();
        this.precision = padawanBuilder.getPrecision();
        this.honor = padawanBuilder.getHonor();
        this.level = padawanBuilder.getLevel();
        //Fazer o Tratamento para pegar a imagem do personagem
    }

    public static class PadawanBuilder extends Jedi {
        public PadawanBuilder(String name, String birthplanet, String birthDate, String resourceimage) {
            super(name, birthplanet, birthDate, resourceimage);
        }

        public Padawan.PadawanBuilder lightsaberColor(LightsaberColor lightsaberColor){
            this.lightsaberColor = lightsaberColor;
            return this;
        }

        public Padawan.PadawanBuilder power(int power){
            this.power = power;
            return this;
        }

        public Padawan.PadawanBuilder agility(int agility){
            this.agility = agility;
            return this;
        }

        public Padawan.PadawanBuilder precision(int precision){
            this.precision = precision;
            return this;
        }

        public Padawan.PadawanBuilder honor(int honor){
            this.honor = honor;
            return this;
        }

        public Padawan.PadawanBuilder level(int level){
            this.level = level -50;   //Os Padawans perdem 50 pontos de level pela inesperiência
            return this;
        }


        public Padawan build(){
            return new Padawan(this);
        }
    }
}
