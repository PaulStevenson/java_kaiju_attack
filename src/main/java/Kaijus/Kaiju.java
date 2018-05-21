package Kaijus;

public abstract class Kaiju {

    private String name;
    private int health;
    private int attack;

    public Kaiju(String name, int health, int attack){
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.health;
    }

    public int getAttack(){
        return this.attack;
    }

    public abstract String monsterSays();

//    public abstract int monsterAttack();

    public static class Johnmon extends Kaiju {

        public Johnmon(String name, int health, int attack) {
            super(name, health, attack);
        }

        @Override
        public String monsterSays() {
            return "My name is John and I say Rawr";
        }




    }

    public static class Zsoltmon extends Kaiju {

        public Zsoltmon(String name, int health, int attack) {
            super(name, health, attack);
        }

        @Override
        public String monsterSays() {
            return "Yada Yada Yada";
        }




    }
}
