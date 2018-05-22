package Kaijus;

import Vehicle.Vehicle;

public class Zsoltmon extends Kaiju implements IAttack {


    public Zsoltmon(String name, int health, int attack) {
        super(name, health, attack);
    }

    @Override
    public String monsterSays() {
        return "Yada Yada Yada";
    }

    @Override
    public void militaryAttack(Vehicle vehicle) {
        this.health -= vehicle.getAttackOne();

    }

    public String monsterMoves() {
        return "I beleive I can fly!";
    }
}
