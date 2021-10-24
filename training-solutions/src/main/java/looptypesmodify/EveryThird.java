package looptypesmodify;

import java.util.Arrays;

public class EveryThird {
    int[] changeToZero(int[] numbers) {
        int[] output = numbers;
        for (int i = output.length - 1; i > 0; i = i - 3) {
            output[i] = 0;
        }
        return output;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 6, 3, 5, 7, 2, 6, 2, 3, 5, 7, 3, 2, 9};

        System.out.println("Eredeti: " + Arrays.toString(numbers));
        EveryThird everyThird = new EveryThird();

        int[] output = everyThird.changeToZero(numbers);

        System.out.println("Új:      " + Arrays.toString(output));
    }
}
