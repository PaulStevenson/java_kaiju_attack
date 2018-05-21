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

}
