package clientApp;

import java.util.Scanner;

public class clientMain {
    public static void main(String[] args) {
        Client client = new Client();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        client.changeName (scanner.nextLine());

        System.out.println("What is your birth year?");
        client.changeYear (Integer.parseInt(scanner.nextLine()));

        System.out.println("What is your address?");
        client.changeAddress (scanner.nextLine());

        String newLine = System.getProperty("line.separator");
        String actualName= client.getName();
        System.out.println("Your name is: " + newLine + actualName);
        int actualYear= client.getYear();
        System.out.println("Your year is: " + newLine + actualYear);
        String actualAddress= client.getAddress();
        System.out.println("Your address is: " + newLine + actualAddress);

        System.out.println("What is your new address?");
        String newAddress =  scanner.nextLine();
        client.migrate(newAddress);
        actualAddress= client.getAddress();
        System.out.println("Your new address is: " + newLine + actualAddress);



    }

}
