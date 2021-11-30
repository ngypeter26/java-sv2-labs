package methodchain;

import org.junit.jupiter.api.Test;

import java.lang.management.GarbageCollectorMXBean;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GrasshopperTest {


    @Test
    void testHopOnce() {
        Grasshopper grasshopper = new Grasshopper();
        grasshopper.hopOnce(Direction.NEGATIVE).hopOnce(Direction.NEGATIVE).hopOnce(Direction.POSITIVE);

        assertEquals(-1, grasshopper.getPosition());
    }

    @Test
    void testMoveFromZeroToThreeWithFiveHops(){
        Grasshopper grasshopper = new Grasshopper();
        grasshopper.moveFromZeroToThreeWithFiveHops();
        assertEquals(3,grasshopper.getPosition());


    }
}
