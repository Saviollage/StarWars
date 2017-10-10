package br.edu.unifei.ecoi09.starwars.humanoid;

public class Hutt extends Humanoid {
    private Hutt(Hutt.HuttBuilder huttBuilder) {
        super(huttBuilder.getName(), huttBuilder.getBirthPlanet(), huttBuilder.getBirthDate(),huttBuilder.getResourceImage());
        this.name = huttBuilder.getName();
        this.birthPlanet = huttBuilder.getBirthPlanet();
        this.weapons = huttBuilder.getWeapons();
        this.power = huttBuilder.getPower();
        this.agility = huttBuilder.getAgility();
        this.precision = huttBuilder.getPrecision();
        this.honor = huttBuilder.getHonor();
        this.level = huttBuilder.getLevel();
        //Fazer o Tratamento para pegar a imagem do personagem
    }

    public static class HuttBuilder extends Humanoid {
        public HuttBuilder(String name, String birthplanet, String birthDate, String resourceimage) {
            super(name, birthplanet, birthDate, resourceimage);
        }

        public Hutt.HuttBuilder weapons(Weapons weapons){
            this.weapons = weapons;
            return this;
        }

        public Hutt.HuttBuilder power(int power){
            this.power = power;
            return this;
        }

        public Hutt.HuttBuilder agility(int agility){
            this.agility = agility - 50; //Hutts perdem 50 pontos a mais de agilidade
            return this;
        }

        public Hutt.HuttBuilder precision(int precision){
            this.precision = precision;
            return this;
        }

        public Hutt.HuttBuilder honor(int honor){
            this.honor = honor;
            return this;
        }

        public Hutt.HuttBuilder level(int level){
            this.level = level + 300;   //Os Hutts sempre ganham 300 pontos a mais de level pela experiência e pela reputação
            return this;
        }

        public Hutt build(){
            return new Hutt(this);
        }
    }
}
