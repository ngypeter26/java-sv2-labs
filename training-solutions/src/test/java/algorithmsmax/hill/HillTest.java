package algorithmsmax.hill;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HillTest {

    @Test
    void testGetMax(){
        List<Integer> peaks = Arrays.asList(250,300,150,800,750,620,920,550);
        int expected = 920;
        assertEquals(expected,new Hill().getMax(peaks));
    }

}
