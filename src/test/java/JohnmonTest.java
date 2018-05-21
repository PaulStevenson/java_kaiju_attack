import Kaijus.Kaiju;
import Vehicle.Tank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JohnmonTest {

    Kaiju.Johnmon johnmon;
    Tank tank;

    @Before
    public void before(){
        johnmon = new Kaiju.Johnmon("Kaijus.Kaiju.Johnmon", 100, 30);
    }

    @Test
    public void canGetName(){
        assertEquals("Kaijus.Kaiju.Johnmon", johnmon.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, johnmon.getHealth());
    }

    @Test
    public void canGetAttack(){
        assertEquals(30, johnmon.getAttack());
    }

    @Test
    public void monsterSays(){
        assertEquals("My name is John and I say Rawr", johnmon.monsterSays());
    }

//    @public void monsterAttack(){
//        johnmon.monsterAttack(canGetAttack());
//    }

}
