package introconstructors;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class TaskMain {
    public static void main(String[] args) {

        Task task = new Task("Task1","Finish the constructor");

        LocalDateTime time1 = LocalDateTime.now();
        task.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Csináld a feladatot!");
        System.out.println("Ha kész vagy, nyomj egy entert!");
        scanner.nextLine();

        LocalDateTime time2 = LocalDateTime.now();

        Duration timeElapsed = Duration.between(time1, time2);

        task.setDuration(timeElapsed);
        //timeElapsed.toMillis()
        System.out.println("A feladat címe: " + task.getTitle());
        System.out.println("A feladat leírása: " + task.getDescription());
        System.out.println("A feladat időtartama: " + task.getDuration().toMillis() + "ms");
        System.out.println("A feladat kezdete: " + task.getStartDateTime());

    }
}
