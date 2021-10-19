package classstructureintegrate;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your bank account?");
        String account = scanner.nextLine();

        System.out.println("What is your balance?");
        int balance = scanner.nextInt();

        BankAccount firstPerson = new BankAccount(account, name, balance);

        System.out.println("What is your additional deposit?");
        firstPerson.deposit(scanner.nextInt());

        System.out.println("What is your withdraw?");
        firstPerson.withdraw(scanner.nextInt());

        String newLine = System.getProperty("line.separator");//This will retrieve line separator dependent on OS.

        System.out.println("Your data are: " + newLine + firstPerson.getInfo() );


    }
}
