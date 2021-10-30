package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a neved");
        String name = scanner.nextLine();

        System.out.println("Add meg a születési dátumod:");
        System.out.println("Év");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Hónap");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("nap");
        int day = Integer.parseInt(scanner.nextLine());
        LocalDate birthDay = LocalDate.of(year,month,day);

        System.out.println("Add meg az irányítószámod!");
        int postCode =Integer.parseInt(scanner.nextLine()) ;

        System.out.println("Add meg az átlagod!");
        double average =Double.parseDouble(scanner.nextLine()) ;


       Person person = new Person(name,birthDay,postCode,average);
        System.out.println(person.toString());
       Exam exam = new Exam();
       exam.addPerson(person);
//
       System.out.println(exam.getPersonList());
    }
}
