package Vehicle;


import Kaijus.Kaiju;

public class Tank extends Vehicle implements IAttack{

    private int getVehicleHealth;

    public Tank(String type, int health, int attackOne, int attackTwo) {
        super(type, health, attackOne, attackTwo);
    }

    public void causeDamange(Kaiju kaiju){
        this.getVehicleHealth -= kaiju.getAttack();
    }
}
