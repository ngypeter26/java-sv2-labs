package training;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World! ");

        String message = "Hello World with variable!";
        System.out.println(message);

        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Your name is " + name + "?");

        System.out.println("What is your birth year?");
        int yearOfBirth = scanner.nextInt();
        System.out.println("Your birth year is " + yearOfBirth + "?");

        int age = 2019 - yearOfBirth;
        System.out.println("Your age is " + age + "?");


    }
}
