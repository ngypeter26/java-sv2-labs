package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        UserValidator userValidator = new UserValidator();
        Scanner scanner = new Scanner(System.in);
        String answer = "Helyes";

        System.out.println("Add meg a felhasználónevet!");
        String userName = scanner.nextLine();
        answer = userValidator.isValidUsername(userName) ? "Helyes" : "Helytelen";
        System.out.println("A felhasználónév:" + answer);

        System.out.println("Add meg a jelszavad!");
        String password1 = scanner.nextLine();
        System.out.println("Add meg a jelszavad újra!");
        String password2 = scanner.nextLine();
        answer = userValidator.isValidPassword(password1, password2) ? "Helyes" : "Helytelen";
        System.out.println("A jelszó: " + answer);

        System.out.println("Add meg az email címed!");
        String email = scanner.nextLine();
        answer = userValidator.isValidEmail(email) ? "Helyes" : "Helytelen";
        System.out.println("Az email cím: " + answer);
    }
}
