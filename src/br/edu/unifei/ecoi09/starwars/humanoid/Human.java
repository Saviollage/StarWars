package br.edu.unifei.ecoi09.starwars.humanoid;

public class Human extends Humanoid {
    private Human(Human.HumanBuilder humanBuilder) {
        super(humanBuilder.getName(), humanBuilder.getBirthPlanet(), humanBuilder.getBirthDate(),humanBuilder.getResourceImage());
        this.name = humanBuilder.getName();
        this.birthPlanet = humanBuilder.getBirthPlanet();
        this.weapons = humanBuilder.getWeapons();
        this.power = humanBuilder.getPower();
        this.agility = humanBuilder.getAgility();
        this.precision = humanBuilder.getPrecision();
        this.honor = humanBuilder.getHonor();
        this.level = humanBuilder.getLevel();
        //Fazer o Tratamento para pegar a imagem do personagem
    }

    public static class HumanBuilder extends Humanoid {
        public HumanBuilder(String name, String birthplanet, String birthDate, String resourceimage) {
            super(name, birthplanet, birthDate, resourceimage);
        }

        public Human.HumanBuilder weapons(Weapons weapons){
            this.weapons = weapons;
            return this;
        }

        public Human.HumanBuilder power(int power){
            this.power = power;
            return this;
        }

        public Human.HumanBuilder agility(int agility){
            this.agility = agility + 60; //Humans recebem 60 pontos a mais de agilidade
            return this;
        }

        public Human.HumanBuilder precision(int precision){
            this.precision = precision;
            return this;
        }

        public Human.HumanBuilder honor(int honor){
            this.honor = honor;
            return this;
        }

        public Human.HumanBuilder level(int level){
            this.level = level + 80;   //Os Humans sempre ganham 80 pontos a mais de level pela experiência e pela reputação
            return this;
        }

        public Human build(){
            return new Human(this);
        }
    }
}
