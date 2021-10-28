package compositionlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Books {

    private List<String> titles = new ArrayList<>();

    public void addBook(String title){
        titles.add(title);
    }

    public void findBookAndSetAuthor(String title, String author){
        //boolean isMember = titles.contains(title);
        if (titles.contains(title)==true) {
            int index = titles.indexOf(title);
            titles.set(index,author +": " + title );
        }
    }

    public List<String> getTitles() {
        return titles;
    }
}
