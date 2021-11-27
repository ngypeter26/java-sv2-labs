package recursion;

import java.util.Arrays;

public class Numbers {

    public int getSum(int[] numbers){
        if (numbers.length>1) {
//            System.out.println(numbers.length);
            int solution = getSum(Arrays.copyOf(numbers,numbers.length-1));
            System.out.println(solution);
            return solution + numbers[numbers.length - 1];
        }
        else{
            return numbers[0];
        }
    }
}
