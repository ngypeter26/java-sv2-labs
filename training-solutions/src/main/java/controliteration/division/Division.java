package controliteration.division;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni.");
        int maxNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int divider = scanner.nextInt();
        scanner.nextLine();

        System.out.println("while ciklussal");
        int i = divider;
        while (i < maxNumber){
            System.out.print(i + ", ");
            i+=divider;
        }

        System.out.println();
        System.out.println("for ciklussal");
        for (i = divider; i <  maxNumber; i+=divider){
            System.out.print(i + ", ");
        }
    }

}
