package introcontrol;

import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adj meg egy számot!");
        int number = scanner.nextInt();
         scanner.nextLine();

        if (number > 100){
            System.out.println("Nagyobb, mint 100");
        }
        else{
            System.out.println("100, vagy kisebb");
        }
    }
}
