package introexceptiontrycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

////         megoldás 1: int
//        System.out.println("Add meg az első számot!");
//            int firstNumber = scanner.nextInt();
//            scanner.nextLine();
//
//        System.out.println("Add meg a második számot!");
//        int secondNumber = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("Add meg a műveletet: +, - , * , /");
//        String operation = scanner.nextLine();
//
//        int result;
//        switch (operation){
//            case "+" : {
//                result = firstNumber + secondNumber;
//                System.out.println(result);
//                break;
//            }
//            case "-" : {
//                result = firstNumber - secondNumber;
//                System.out.println(result);
//                break;
//            }
//            case "*" : {
//                result = firstNumber * secondNumber;
//                System.out.println(result);
//                break;
//            }
//            case "/" : {
//                result = firstNumber / secondNumber;
//                System.out.println(result);
//                break;
//            }
//            case "v" : {
//                System.out.println(Math.sqrt(  (double) firstNumber ) );
//                break;
//            }
//            default: {
//                System.out.println("Ilyen művelet nincs!");
//            }
//            System.out.println("End");
//        }

        // megoldás 2: int
        System.out.println("Add meg az első számot!");
        double firstNumber = 0;
        try {
            firstNumber = scanner.nextDouble();
        }
        catch (InputMismatchException nfe){
            System.out.println("Nincs ilyen szám");
            System.out.println("Az alapértelmezett érték 0");
        }
        scanner.nextLine();

        System.out.println("Add meg a második számot!");
        double secondNumber = 1;
        try {
            secondNumber = scanner.nextDouble();
        }
        catch (InputMismatchException nfe){
            System.out.println("Nincs ilyen szám");
            System.out.println("Az alapértelmezett érték 1");
        }
        scanner.nextLine();

        System.out.println("Add meg a műveletet: +, - , * , /,v");
        String operation = scanner.nextLine();

        double result;
        switch (operation){
            case "+" : {
                result = firstNumber + secondNumber;
                System.out.println(result);
                break;
            }
            case "-" : {
                result = firstNumber - secondNumber;
                System.out.println(result);
                break;
            }
            case "*" : {
                result = firstNumber * secondNumber;
                System.out.println(result);
                break;
            }
            case "/" : {
                result = firstNumber / secondNumber;
                System.out.println(result);
                break;
            }
            case "v" : {
                result = Math.sqrt(firstNumber) + Math.sqrt(secondNumber);
                System.out.println(result);
                break;
            }
            default: {
                System.out.println("Ilyen művelet nincs!");
            }
            System.out.println("End");
        }
    }
}
