package immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarTest {

    @Test
    void testCreateName(){
        IllegalArgumentException e1 = assertThrows(IllegalArgumentException.class,
                ()-> new Car("   ","  ",2010));
        IllegalArgumentException e2 = assertThrows(IllegalArgumentException.class,
                ()-> new Car("Ford","  ",2025));
        IllegalArgumentException e3 = assertThrows(IllegalArgumentException.class,
                ()-> new Car(null,"  ",2010));

        Car car4 = new Car("Skoda","Fabia",2012);

        assertEquals("Invalid name",e1.getMessage());
        assertEquals("Invalid year",e2.getMessage());
        assertEquals("Invalid name",e3.getMessage());
        assertEquals("Skoda",car4.getBrand());
        assertEquals("Fabia",car4.getType());
        assertEquals(2012,car4.getManufactureYear());

    }

}
