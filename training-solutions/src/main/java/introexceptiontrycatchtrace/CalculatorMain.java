package introexceptiontrycatchtrace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Add meg az első számot!");
        int firstNumber = 0;
        try {
            firstNumber = scanner.nextInt();
        }
        catch (InputMismatchException nfe){
            System.out.println("Nincs ilyen szám");
            System.out.println("Az alapértelmezett érték 0");
        }
        scanner.nextLine();

        System.out.println("Add meg a második számot!");
        int secondNumber = 1;
        try {
            secondNumber = scanner.nextInt();
        }
        catch (InputMismatchException nfe){
            System.out.println("Nincs ilyen szám");
            System.out.println("Az alapértelmezett érték 1");
        }
        scanner.nextLine();

        System.out.println("Add meg a műveletet: +, - , * , /,v");
        String operation = scanner.nextLine();

        System.out.println("Az eredmény: " + calculator.Operation(firstNumber,secondNumber,operation));
    }
}
