package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;

public class Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hány adatot rögzítnél?");

        int numberOfData = 0;
        try {
            numberOfData = scanner.nextInt();
        } catch(InputMismatchException ime){
            System.out.println("Rossz formátumot adtál meg! Adj meg számot!");
        }
        scanner.nextLine();

        List<String> birthdays = new ArrayList<>();
        for (int i = 0; i < numberOfData; i++) {
            System.out.println("Név: ");
            String name = scanner.nextLine();
            System.out.println("Születésnap: ");
            String birthday = scanner.nextLine();
            birthdays.add(name + ", " + birthday);
        }

        String fileName = "src/main/java/introexceptionwritefile/birthdays.txt";
        Path path = Paths.get(fileName);
        try {
            Files.write(path, birthdays);
        } catch (IOException ioe) {
            throw new IllegalStateException("Error while writing file.", ioe);
        }

    }



}
