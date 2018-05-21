import Vehicle.Tank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TankTest {

    Tank tank;
    Johnmon johnmon;

    @Before
    public void before(){
        tank = new Tank("Tank", 50, 15, 25);
        johnmon = new Johnmon("Johnmon", 100, 30);
    }

    @Test
    public void getVehicleType(){
        assertEquals("Tank", tank.getVehicleType());
    }

    @Test
    public void getVehicleHealth(){
        assertEquals(50, tank.getVehicleHealth());
    }

    @Test
    public void getAttackOne(){
        assertEquals(15, tank.getAttackOne());
    }

    @Test
    public void getAttackTwo(){
        assertEquals(25, tank.getAttackTwo());
    }

//    @Test
//    public void damageVehicle(Tank tank, Johnmon johnmon){
//        johnmon.getAttack();
//        assertEquals(20, tank.getVehicleHealth());
//    }


}
