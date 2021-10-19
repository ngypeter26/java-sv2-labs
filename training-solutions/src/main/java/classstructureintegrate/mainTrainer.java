package classstructureintegrate;

import java.util.Scanner;

public class mainTrainer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your birth year?");
        int yearOfBirth = scanner.nextInt();

        Trainer trainer = new Trainer(name, yearOfBirth);

        System.out.println(trainer.getNameAndYearOfBirth());


    }
}
