package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg az első számot!");
        int firstNumber = scanner.nextInt();

        System.out.println("Add meg a második számot!");
        int secondNumber = scanner.nextInt();

        int result = firstNumber + secondNumber;

        String newLine = System.getProperty("line.separator");//This will retrieve line separator dependent on OS.

        System.out.println("line 1" + newLine + "line2");

        System.out.println("Az összeadás eredménye: " + newLine + firstNumber + "+" + secondNumber + "=" + result );

    }
}
