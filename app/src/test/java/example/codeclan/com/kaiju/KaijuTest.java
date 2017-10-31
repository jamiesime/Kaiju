package example.codeclan.com.kaiju;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 27/10/2017.
 */

public class KaijuTest {

    Onionsaur onionsaur;
    Tricycle tricycle;

    @Before
    public void setUp() {
        onionsaur = new Onionsaur("Big Onionsaur", 500, 100);
        tricycle = new Tricycle("Wobbly Tricycle", 3);
    }

    @Test
    public void testAttack(){
        onionsaur.attack(tricycle);
        int newHealth = tricycle.getHealthValue();
        assert(newHealth == -97);
    }

    @Test
    public void testMove() {
        assertEquals("Big Onionsaur stomped around and stank the place up.", onionsaur.move());
    }
}
