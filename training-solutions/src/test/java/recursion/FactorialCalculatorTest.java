package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialCalculatorTest {
    @Test
    void simplestCase() {
        //given
        int number = 1;
        //when
        long actual = new FactorialCalculator().getFactorial(number);
        //then
        assertEquals(actual, 1L);
    }

    @Test
    void greaterCase() {
        //given
        int number = 4;
        //when
        long actual = new FactorialCalculator().getFactorial(number);
        //then
        assertEquals(actual, 24L);
    }

}
