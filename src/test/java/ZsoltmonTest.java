
    
    
import Kaijus.Zsoltmon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ZsoltmonTest {

        Zsoltmon zsoltmon;
        

        @Before
        public void before(){
            zsoltmon = new Zsoltmon("Zsoltmon", 100, 35);
        }

        @Test
        public void canGetName(){
            assertEquals("Zsoltmon", zsoltmon.getName());
        }

        @Test
        public void canGetHealth(){
            assertEquals(100, zsoltmon.getHealth());
        }

        @Test
        public void canGetAttack(){
            assertEquals(35, zsoltmon.getAttack());
        }

        @Test
        public void monsterSays(){
            assertEquals("Yada Yada Yada", zsoltmon.monsterSays());
        }


    }


