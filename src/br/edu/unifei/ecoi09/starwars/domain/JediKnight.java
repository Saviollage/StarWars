package br.edu.unifei.ecoi09.starwars.domain;

public class JediKnight extends Jedi {
    private JediKnight(JediKnight.JediKnightBuilder jediKnightBuilder) {
        super(jediKnightBuilder.getName(), jediKnightBuilder.getBirthPlanet(), jediKnightBuilder.getBirthDate(),jediKnightBuilder.getResourceImage());
        this.name = jediKnightBuilder.getName();
        this.birthPlanet = jediKnightBuilder.getBirthPlanet();
        this.lightsaberColor = jediKnightBuilder.getLightsaberColor();
        this.power = jediKnightBuilder.getPower();
        this.agility = jediKnightBuilder.getAgility();
        this.precision = jediKnightBuilder.getPrecision();
        this.honor = jediKnightBuilder.getHonor();
        this.level = jediKnightBuilder.getLevel();
        //Fazer o Tratamento para pegar a imagem do personagem
    }

    public static class JediKnightBuilder extends Jedi {
        public JediKnightBuilder(String name, String birthplanet, String birthDate, String resourceimage) {
            super(name, birthplanet, birthDate, resourceimage);
        }

        public JediKnight.JediKnightBuilder lightsaberColor(LightsaberColor lightsaberColor){
            this.lightsaberColor = lightsaberColor;
            return this;
        }

        public JediKnight.JediKnightBuilder power(int power){
            this.power = power;
            return this;
        }

        public JediKnight.JediKnightBuilder agility(int agility){
            this.agility = agility;
            return this;
        }

        public JediKnight.JediKnightBuilder precision(int precision){
            this.precision = precision;
            return this;
        }

        public JediKnight.JediKnightBuilder honor(int honor){
            this.honor = honor;
            return this;
        }

        public JediKnight.JediKnightBuilder level(int level){
            this.level = level + 50;   //Os jediKnights sempre ganham 50 pontos a mais de level pela experiência e pela reputação
            return this;
        }


        public JediKnight build(){
            return new JediKnight(this);
        }
    }
}
