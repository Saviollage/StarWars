package br.edu.unifei.ecoi09.starwars.humanoid;

public class Gungan extends Humanoid {
    private Gungan(Gungan.GunganBuilder gunganBuilder) {
        super(gunganBuilder.getName(), gunganBuilder.getBirthPlanet(), gunganBuilder.getBirthDate(),gunganBuilder.getResourceImage());
        this.name = gunganBuilder.getName();
        this.birthPlanet = gunganBuilder.getBirthPlanet();
        this.weapons = gunganBuilder.getWeapons();
        this.power = gunganBuilder.getPower();
        this.agility = gunganBuilder.getAgility();
        this.precision = gunganBuilder.getPrecision();
        this.honor = gunganBuilder.getHonor();
        this.level = gunganBuilder.getLevel();
        //Fazer o Tratamento para pegar a imagem do personagem
    }

    public static class GunganBuilder extends Humanoid {
        public GunganBuilder(String name, String birthplanet, String birthDate, String resourceimage) {
            super(name, birthplanet, birthDate, resourceimage);
        }

        public Gungan.GunganBuilder weapons(Weapons weapons){
            this.weapons = weapons;
            return this;
        }

        public Gungan.GunganBuilder power(int power){
            this.power = power;
            return this;
        }

        public Gungan.GunganBuilder agility(int agility){
            this.agility = agility + 60; //Gungans recebem 60 pontos a mais de agilidade
            return this;
        }

        public Gungan.GunganBuilder precision(int precision){
            this.precision = precision;
            return this;
        }

        public Gungan.GunganBuilder honor(int honor){
            this.honor = honor;
            return this;
        }

        public Gungan.GunganBuilder level(int level){
            this.level = level + 80;   //Os Gungans sempre ganham 80 pontos a mais de level pela experiência e pela reputação
            return this;
        }

        public Gungan build(){
            return new Gungan(this);
        }
    }
}
