package algorithmsdecision.words;

import java.util.List;

public class Word {
    public boolean containsLongerWord(List<String> words, String reference){
        for (String word : words){
            if (word.length() > reference.length()){
//                System.out.println(word);
                return true;
            }
        }
        return false;
    }
}
