package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a neved!");
        String name = scanner.nextLine();

        System.out.println("Add meg a születési éved");
        int birthYear = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Add meg a születési hónapod számát!");
        int birthMonth = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Add meg a születési napod!");
        int birthDay = scanner.nextInt();
        scanner.nextLine();

        //LocalDate start = LocalDate.of(2015, 1, 20);

        LocalDate dateOfBirth = LocalDate.of(birthYear,birthMonth,birthDay);
        LocalDateTime beginEmployment = LocalDateTime.now();

        Employee employee = new Employee(name,dateOfBirth,beginEmployment);

        System.out.println("Név: " + employee.getName());
        System.out.println("Szülewtési idő: " + employee.getDateOfBirth());
        System.out.println("Kezdés: " + employee.getBeginEmployment());
    }
}

//    public String convertDatum(String birthDateInput){
//        return birthDateInput.replaceAll(".",",");
//    }