package attributes.book;

public class BookMain {
    public static void main(String[] args) {
        String titleAct = "Harry Potter";

        Book book = new Book(titleAct);

        System.out.println(book.getTitle());

        String titleNew = "Semmi";
        book.setTitle(titleNew);
        System.out.println(book.getTitle());
    }
}
