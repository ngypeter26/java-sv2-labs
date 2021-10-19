package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adj meg egy számot!");
        int number = scanner.nextInt();

        boolean answer =  (number % 3) == 0;
        System.out.println("Osztható 3-mal:" + answer  );
    }
}
