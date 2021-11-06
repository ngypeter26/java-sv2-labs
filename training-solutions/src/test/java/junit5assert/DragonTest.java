package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DragonTest {
    @Test
    void testName(){
        String name =  "dragon007";
        String wrongname =  "dragon008";
        assertEquals(name,new Dragon(name,0,0).getName());
        assertNotEquals(wrongname,new Dragon(name,0,0).getName());
    }
    @Test
    void testNumberOfHeads() {
     int numberOfHead = 12;
     Dragon dragon =new Dragon(null,numberOfHead,0);
     assertEquals(numberOfHead,dragon.getNumberOfHeads());
     assertTrue(numberOfHead==dragon.getNumberOfHeads());
     assertFalse(numberOfHead+1==dragon.getNumberOfHeads());
    }
    @Test
    void testHeight() {
        double height = 178.1;
        Dragon dragon =new Dragon(null,0,height);
        assertEquals(178.1001,dragon.getHeight(),0.1);
    }
    @Test
    void testNull() {
        Dragon dragon =new Dragon(null,0,0);
        Dragon anotherDragon =null;
        assertNotNull(dragon);
        assertNull(anotherDragon);
    }
    @Test
    void testSameObjects() {
        Dragon dragon =new Dragon(null,0,0);
        Dragon anotherDragon =dragon;
        assertSame(dragon,anotherDragon);
    }
    @Test
    void testNotSameObjects() {
        Dragon dragon =new Dragon(null,0,0);
        Dragon anotherDragon =new Dragon(null,0,0);
        assertNotSame(dragon,anotherDragon);
    }
}
