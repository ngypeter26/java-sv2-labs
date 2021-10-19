package classstructureconstructors;

public class bookMain {
    public static void main(String[] args) {

        Book book  = new Book("J.K Rowling", "Harry Potter");

        book.register("ISN 1253");

        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Registration number: " + book.getRegNumber());
    }
}
