package br.edu.unifei.ecoi09.starwars.domain;

public class Sith extends Jedi {
    private Sith(SithBuilder sithBuilder) {
        super(sithBuilder.getName(), sithBuilder.getBirthPlanet(), sithBuilder.getBirthDate(),sithBuilder.getResourceImage());
            this.name = sithBuilder.getName();
            this.birthPlanet = sithBuilder.getBirthPlanet();
            this.lightsaberColor = sithBuilder.getLightsaberColor();
            this.force = sithBuilder.getForce();
            this.velocity = sithBuilder.getVelocity();
            this.hability = sithBuilder.getHability();
            this.experience = sithBuilder.getExperience();
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

            public SithBuilder force(int force){
                this.force = force;
                return this;
            }

            public SithBuilder velocity(int velocity){
                this.velocity = velocity;
                return this;
            }

            public SithBuilder hability(int hability){
                this.hability = hability;
                return this;
            }

            public SithBuilder experience(int experience){
                this.experience = experience;
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