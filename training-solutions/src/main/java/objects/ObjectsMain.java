package objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ObjectsMain {
    public static void main(String[] args) {

        new Book();
        System.out.println(new Book());

        //Book emptyBook;     // ez nem működik
       // System.out.println(emptyBook);

        Book emptyBook = null;
        System.out.println(emptyBook);

        Book book  = new Book();
        System.out.println(book);

        book = null;
        System.out.println(book);

        Book anotherBook = new Book();
        System.out.println(anotherBook);
        System.out.println(anotherBook == book);

        anotherBook = book;
        System.out.println(anotherBook);
        System.out.println(anotherBook == book);

        //tömbök és listák
        Book[] books = {new Book(), new Book(),new Book()};
        List<Book>  bookList = Arrays.asList(new Book(), new Book(),new Book());

        List<Book> book3 = new ArrayList<>();

        book3.add(new Book());
        book3.add(new Book());
        book3.add(new Book());
    }
}
