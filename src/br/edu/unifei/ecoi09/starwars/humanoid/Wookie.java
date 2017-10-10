package br.edu.unifei.ecoi09.starwars.humanoid;

public class Wookie extends Humanoid {
    private Wookie(Wookie.WookieBuilder wookieBuilder) {
        super(wookieBuilder.getName(), wookieBuilder.getBirthPlanet(), wookieBuilder.getBirthDate(),wookieBuilder.getResourceImage());
        this.name = wookieBuilder.getName();
        this.birthPlanet = wookieBuilder.getBirthPlanet();
        this.weapons = wookieBuilder.getWeapons();
        this.power = wookieBuilder.getPower();
        this.agility = wookieBuilder.getAgility();
        this.precision = wookieBuilder.getPrecision();
        this.honor = wookieBuilder.getHonor();
        this.level = wookieBuilder.getLevel();
        //Fazer o Tratamento para pegar a imagem do personagem
    }

    public static class WookieBuilder extends Humanoid {
        public WookieBuilder(String name, String birthplanet, String birthDate, String resourceimage) {
            super(name, birthplanet, birthDate, resourceimage);
        }

        public Wookie.WookieBuilder weapons(Weapons weapons){
            this.weapons = weapons;
            return this;
        }

        public Wookie.WookieBuilder power(int power){
            this.power = power;
            return this;
        }

        public Wookie.WookieBuilder agility(int agility){
            this.agility = agility + 20; //Wookies recebem 20 pontos a mais de agilidade
            return this;
        }

        public Wookie.WookieBuilder precision(int precision){
            this.precision = precision;
            return this;
        }

        public Wookie.WookieBuilder honor(int honor){
            this.honor = honor;
            return this;
        }

        public Wookie.WookieBuilder level(int level){
            this.level = level + 200;   //Os wookies sempre ganham 200 pontos a mais de level pela experiência e pela reputação
            return this;
        }

        public Wookie build(){
            return new Wookie(this);
        }
    }
}
