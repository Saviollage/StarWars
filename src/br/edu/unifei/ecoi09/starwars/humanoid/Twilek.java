package br.edu.unifei.ecoi09.starwars.humanoid;

public class Twilek extends Humanoid {
    private Twilek(Twilek.TwilekBuilder twilekBuilder) {
        super(twilekBuilder.getName(), twilekBuilder.getBirthPlanet(), twilekBuilder.getBirthDate(),twilekBuilder.getResourceImage());
        this.name = twilekBuilder.getName();
        this.birthPlanet = twilekBuilder.getBirthPlanet();
        this.weapons = twilekBuilder.getWeapons();
        this.power = twilekBuilder.getPower();
        this.agility = twilekBuilder.getAgility();
        this.precision = twilekBuilder.getPrecision();
        this.honor = twilekBuilder.getHonor();
        this.level = twilekBuilder.getLevel();
        //Fazer o Tratamento para pegar a imagem do personagem
    }

    public static class TwilekBuilder extends Humanoid {
        public TwilekBuilder(String name, String birthplanet, String birthDate, String resourceimage) {
            super(name, birthplanet, birthDate, resourceimage);
        }

        public Twilek.TwilekBuilder weapons(Weapons weapons){
            this.weapons = weapons;
            return this;
        }

        public Twilek.TwilekBuilder power(int power){
            this.power = power;
            return this;
        }

        public Twilek.TwilekBuilder agility(int agility){
            this.agility = agility + 60; //Twileks recebem 60 pontos a mais de agilidade
            return this;
        }

        public Twilek.TwilekBuilder precision(int precision){
            this.precision = precision;
            return this;
        }

        public Twilek.TwilekBuilder honor(int honor){
            this.honor = honor;
            return this;
        }

        public Twilek.TwilekBuilder level(int level){
            this.level = level + 90;   //Os Twilek sempre ganham 90 pontos a mais de level pela experiência e pela reputação
            return this;
        }

        public Twilek build(){
            return new Twilek(this);
        }
    }
}
