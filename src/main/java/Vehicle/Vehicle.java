package Vehicle;

public abstract class Vehicle{

    private String type;
    private int vehicleHealth;
    private int attackOne;
    private int attackTwo;
  


    public Vehicle(String type, int vehicleHealth, int attackOne, int attackTwo){
        this.type = type;
        this.vehicleHealth = vehicleHealth;
        this.attackOne = attackOne;
        this.attackTwo = attackTwo;

    }

    public String getVehicleType(){
        return type;
    }

    public int getVehicleHealth(){
        return vehicleHealth;
    }

    public int getAttackOne() {
        return attackOne;
    }

    public int getAttackTwo() {
        return attackTwo;
    }

//    public int canDamageVehicle(){
//        return vehicleHealth -= ;
//    }
}
