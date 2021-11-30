package methodparam.sums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeparatedSumTest {

    @Test
    void sumTest(){
        String input =new SeparatedSum().readFromFile();
        Result result = new SeparatedSum().sum(input);

        assertEquals(110.6,result.getSumPlus(),0.000001);
        assertEquals(-153.3,result.getSumMinus(),0.000001);

    }
}
