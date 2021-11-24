package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeightTest {

    @Test
    void counterTest(){
        List<Integer> heights = Arrays.asList(165,170,150,145,180,168,155);
        int limit = 150;

        assertEquals(5,new Height().countChildrenWithHeightGreaterThan(heights,limit));
    }
}
