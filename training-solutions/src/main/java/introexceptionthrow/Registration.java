package introexceptionthrow;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validation validation = new Validation();
        boolean validRegistration = true;
        System.out.println("Szia!");

        System.out.println("Add meg a neved!");
        String name = scanner.nextLine();

        try {
            validation.validateName(name);
        }
        catch (IllegalArgumentException nfe){
            System.out.println(nfe.getMessage());
            validRegistration = false;
        }

        System.out.println("Add meg a korod!");
        String ageString = scanner.nextLine();

        try {
            validation.validateAge(ageString);
        }
        catch (IllegalArgumentException nfe){
            System.out.println(nfe.getMessage());
            validRegistration = false;
        }

        System.out.println("A megadott adatok: ");
        System.out.println("név: " + name);
        System.out.println("kor: " + ageString);

        if (validRegistration) {
            System.out.println("Sikeres regisztráció");
        } else {
            System.out.println("Sikertelen regisztráció");
        }


    }

}
