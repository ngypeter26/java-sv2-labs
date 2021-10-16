package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your e-mail address?");
        String email = scanner.nextLine();

        String newLine = System.getProperty("line.separator");//This will retrieve line separator dependent on OS.


        System.out.println("Thank you" + newLine +
                            "Your name is: " + name + newLine +
                            "Your email is: " + email);


    }
}
