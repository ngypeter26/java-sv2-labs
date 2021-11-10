package controliteration.fibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány elemet kérsz?");
        int number = scanner.nextInt();
        scanner.nextLine();


        List<Integer> fibonacciSeriesFor = new ArrayList<>(Arrays.asList(1,1));
        for(int i = 2 ; i<number ; i++){
            fibonacciSeriesFor.add(fibonacciSeriesFor.get(i-1)+fibonacciSeriesFor.get(i-2));
        }

        System.out.println(fibonacciSeriesFor);

    }
}
