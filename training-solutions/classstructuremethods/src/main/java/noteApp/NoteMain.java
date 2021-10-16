package noteApp;

import java.util.Scanner;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Név:");
        note.setName(scanner.nextLine());

        System.out.println("Téma:");
        note.setTopic(scanner.nextLine());

        System.out.println("Jegyzet:");
        note.setNote(scanner.nextLine());

       // String actualValue = note.getNoteText();
        System.out.println(note.getNoteText());


    }
}
