package introexceptionthrow;

import java.util.Scanner;

public class AdultContent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "xyz";

        System.out.println("Add meg a korod!");
        int age = scanner.nextInt();
        scanner.nextLine();

        Adult adult = new Adult(name,age);
    }
}
