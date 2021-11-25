package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureTest {

    @Test
    void testGetMin(){
        List<Integer> temperatures = Arrays.asList(-2,0,10,-5,2,20,-4,0,40);
        int expected = -5;
        assertEquals(expected,new Temperature().getMin(temperatures));
    }
}
