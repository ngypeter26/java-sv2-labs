package algorithmsfilter.prefix;

import java.util.ArrayList;
import java.util.List;

public class Prefix {
    public List<String> getWordsStartWith(List<String> words, String prefix){
        List<String> filteredWords = new ArrayList<>();

        for (String s : words){
            if (s.startsWith(prefix)){
                filteredWords.add(s);
            }
        }
        return filteredWords;
    }
}
