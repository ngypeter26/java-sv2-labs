package algorithmsdecision.towns;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TownTest {

    @Test
    void containsFewerTest(){
        List<Integer> towns = Arrays.asList(10,5,12,24,52,102,240,250);

        assertFalse(new Town().containsFewerHabitants(towns,5));
        assertFalse(new Town().containsFewerHabitants(towns,4));
        assertTrue(new Town().containsFewerHabitants(towns,6));
    }

}
