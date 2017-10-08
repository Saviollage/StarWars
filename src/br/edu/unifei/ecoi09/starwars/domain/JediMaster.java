package br.edu.unifei.ecoi09.starwars.domain;

public class JediMaster extends Jedi {
    private JediMaster(JediMaster.JediMasterBuilder jediMasterBuilder) {
        super(jediMasterBuilder.getName(), jediMasterBuilder.getBirthPlanet(), jediMasterBuilder.getBirthDate(),jediMasterBuilder.getResourceImage());
        this.name = jediMasterBuilder.getName();
        this.birthPlanet = jediMasterBuilder.getBirthPlanet();
        this.lightsaberColor = jediMasterBuilder.getLightsaberColor();
        this.power = jediMasterBuilder.getPower();
        this.agility = jediMasterBuilder.getAgility();
        this.precision = jediMasterBuilder.getPrecision();
        this.honor = jediMasterBuilder.getHonor();
        this.level = jediMasterBuilder.getLevel();
        //Fazer o Tratamento para pegar a imagem do personagem
    }

    public static class JediMasterBuilder extends Jedi {
        public JediMasterBuilder(String name, String birthplanet, String birthDate, String resourceimage) {
            super(name, birthplanet, birthDate, resourceimage);
        }

        public JediMaster.JediMasterBuilder lightsaberColor(LightsaberColor lightsaberColor){
            this.lightsaberColor = lightsaberColor;
            return this;
        }

        public JediMaster.JediMasterBuilder power(int power){
            this.power = power;
            return this;
        }

        public JediMaster.JediMasterBuilder agility(int agility){
            this.agility = agility;
            return this;
        }

        public JediMaster.JediMasterBuilder precision(int precision){
            this.precision = precision;
            return this;
        }

        public JediMaster.JediMasterBuilder honor(int honor){
            this.honor = honor;
            return this;
        }

        public JediMaster.JediMasterBuilder level(int level){
            this.level = level + 100;   //Os jediMaster sempre ganham 100 pontos a mais de level pela experiência e pela reputação
            return this;
        }


        public JediMaster build(){
            return new JediMaster(this);
        }
    }
}
