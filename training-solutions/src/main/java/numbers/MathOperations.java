package numbers;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 10;
        int b =3;
        int c = 4;
        int d = 2;
        double computerResult = (double )a / b + c * d;
        double delta = 0.0001;

        System.out.println("Old meg az alábbi feladatot: " + "\n" +
                a + "/" + b +"+"+ c + "*" + d + "=?");
        double userResult = scanner.nextDouble();

        System.out.println(Math.abs(computerResult - userResult) < delta);
        String answer = Math.abs(computerResult - userResult) < delta ? "Helyes" : "Helytelen";
        System.out.println("Az eredmény: "  + answer );
        System.out.println("A helyes válasz: " + computerResult);
    }
}
