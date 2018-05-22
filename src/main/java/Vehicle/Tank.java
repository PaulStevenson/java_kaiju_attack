package Vehicle;
import Kaijus.Kaiju;

public class Tank extends Vehicle implements IAttack{

    public Tank(String type, int health, int attackOne, int attackTwo) {
        super(type, health, attackOne, attackTwo);
    }

    public void causeDamange(Kaiju kaiju){
        this.vehicleHealth-= kaiju.getAttack();
    }
}
