package lambda;

import java.util.List;

public class Remainder {
    public List<Integer> changeNumbersToRemainders(List<Integer> numbers, int divisor){
        List<Integer> remainder = numbers;

        remainder.replaceAll(integer -> integer%divisor);
        return remainder;
    }
}
