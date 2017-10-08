package br.edu.unifei.ecoi09.starwars.domain;

public class Sith extends Jedi {
    private Sith(SithBuilder sithBuilder) {
        super(sithBuilder.getName(), sithBuilder.getBirthPlanet(), sithBuilder.getBirthDate(),sithBuilder.getResourceImage());
            this.name = sithBuilder.getName();
            this.birthPlanet = sithBuilder.getBirthPlanet();
            this.lightsaberColor = sithBuilder.getLightsaberColor();
            this.power = sithBuilder.getPower();
            this.agility = sithBuilder.getAgility();
            this.precision = sithBuilder.getPrecision();
            this.honor = sithBuilder.getHonor();
            this.level = sithBuilder.getLevel();
            //Fazer o Tratamento para pegar a imagem do personagem
        }

    public static class SithBuilder extends Jedi {
            public SithBuilder(String name, String birthplanet, String birthDate, String resourceimage) {
                super(name, birthplanet, birthDate, resourceimage);
            }

            public SithBuilder lightsaberColor(LightsaberColor lightsaberColor){
                this.lightsaberColor = lightsaberColor;
                return this;
            }

            public SithBuilder power(int power){
                this.power = power;
                return this;
            }

            public SithBuilder agility(int agility){
                this.agility = agility;
                return this;
            }

            public SithBuilder precision(int precision){
                this.precision = precision;
                return this;
            }

            public SithBuilder honor(int honor){
                this.honor = honor;
                return this;
            }

            public SithBuilder level(int level){
                this.level = level;
                return this;
            }


            public Sith build(){
                return new Sith(this);
            }
        }
    }