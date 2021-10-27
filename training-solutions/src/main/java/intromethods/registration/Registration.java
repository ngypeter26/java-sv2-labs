package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a vezetékneved!");
        String lastName = scanner.nextLine();
        System.out.println("Add meg a keresztneved!");
        String firstName = scanner.nextLine();

        System.out.println("Add meg a születési éved+");
        int birthYear = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Add meg a születési hónapod számát!");
        int birthMonth = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Add meg a születési napod!");
        int birthDay = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Add meg az email címed!");
        String email = scanner.nextLine();

        Person person0 = new Person("",LocalDate.now(),"");
        Person person = new Person( person0.createFullName(lastName,firstName),
                                    person0.createDate(birthYear,birthMonth,birthDay),
                                    email);

        System.out.println("Az adataid:" + "\n" + person.toString());
    }
}
