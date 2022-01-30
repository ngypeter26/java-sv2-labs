package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Read {
    private List<Book> booksToRead = new ArrayList<>();

    public List<Book> getBooksToRead() {
        return new ArrayList<>(booksToRead);
    }

    public void addBook(Book book) {
        booksToRead.add(book);
    }

    public List<String> listBookTitlesShorterThanGiven(int maxNumberOfPages){
        return booksToRead.stream()
                .filter(book -> book.getNumberOfPages() < maxNumberOfPages)
                .map(book -> book.getTitle())
                .distinct()
//                .peek(System.out::println)
                .collect(Collectors.toList());
    }
    public  List<String> listBookTitlesWithGivenAuthor(String author){
        return booksToRead.stream()
                .filter(book -> book.getAuthor().equals(author))
                .map(book -> book.getTitle())
                .distinct()
                .sorted()
//                .peek(System.out::println)
                .collect(Collectors.toList());
    }
    public List<String> listAuthors(){
        return booksToRead.stream()
                .map(book -> book.getAuthor())
                .distinct()
//                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
