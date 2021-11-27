package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersTest {
    @Test
    void getSumTest(){
        int[] numbers =  {1,2,5,10,12,25,2};
        int expected = 57;
        int actual = new Numbers().getSum(numbers);
        System.out.println(actual);
        assertEquals(expected,actual);
    }
}

