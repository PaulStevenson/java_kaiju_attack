package Kaijus;

public abstract class Kaiju {

    protected String name;
    protected int health;
    protected int attack;

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
