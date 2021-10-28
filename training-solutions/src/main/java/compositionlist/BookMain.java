package compositionlist;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Books books = new Books();

        System.out.println("Hány könyvet akarsz?");
        int numberOfBooks = scanner.nextInt();
        scanner.nextLine();

        for (int i =1; i<numberOfBooks+1;i++){
            System.out.println("Add meg a" + i + ". könyvet!");
            books.addBook(scanner.nextLine());
            }

        System.out.println(books.getTitles());

        String title2 = books.getTitles().get(0);

        books.findBookAndSetAuthor(title2,"senki");

        System.out.println(books.getTitles());

    }




}
