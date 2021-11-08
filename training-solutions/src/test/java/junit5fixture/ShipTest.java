package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class ShipTest {
    Ship ship;

    @BeforeEach
    void initShip(){
        ship = new Ship("Hajo", 2002, 10.2);
    }
    @Test
    void testName(){
        assertEquals("Hajo",ship.getName());
        assertNotEquals("Ha nem jo",ship.getName());
    }
    @Test
    void testYearOfConstruction(){
        assertEquals(2002,ship.getYearOfConstruction());
        assertTrue(2002 == ship.getYearOfConstruction());
        assertFalse(2003 == ship.getYearOfConstruction());

    }
    @Test
    void testLength(){
        assertEquals(10.2,ship.getLength(),0.01);
    }

    @Test
    void testNull(){
        Ship ship2 = null;
        assertNull(ship2);
        assertNotNull(ship);
    }

    @Test
    void testSameObjects(){
        Ship ship3 =  ship;
        assertSame(ship3,ship);
    }
    @Test
    void testNotSameObjects(){
        Ship ship4 = new Ship("Hajo", 2002, 10.2);
        assertNotSame(ship4,ship);
       // assertSame(ship4,ship);
    }
}
