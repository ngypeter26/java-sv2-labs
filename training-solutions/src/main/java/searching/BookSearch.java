package searching;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookSearch {
    private List<Book> books;

    public BookSearch(List<Book> books) {
        this.books = books;
    }

    public Book findBookByAuthorTitle(String author, String title){
        if (isCorrect(author) || isCorrect(title) ){
            throw new IllegalArgumentException("Author or title must not be empty!");
        }
        Book key = new Book(author, title);
        int index = Collections.binarySearch(books,key);
        if (index<0){
            throw new IllegalArgumentException("No book found by " + author + " with title " + title);
        }
        return books.get(index);
    }

    private boolean isCorrect(String str){
        return (str == null || str.trim().isEmpty());
    }
}
