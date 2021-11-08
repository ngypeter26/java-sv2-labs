package junit5fixture;

import java.util.List;
import java.util.ArrayList;

public class Words {
    private List<String> words = new ArrayList<>();

    public void addWord(String word){
        words.add(word);
    }
    void getWordsStartWith(String prefix){// Ez a metódus törölje ki az eredeti listából azokat a szavakat, amelyek nem a megadott prefix-szel kezdődnek!
        List <String> elementsToRemove =new ArrayList<>();
            for (String i : words){
                if (!i.startsWith(prefix)){
                    elementsToRemove.add(i);
                }
            }
            words.removeAll(elementsToRemove);
    }
    void getWordsWithLength(int length){// Ez a metódus törölje ki az eredeti listából azokat a szavakat, amelyek nem a paraméterként megadott hosszúságúak!
        List <String> elementsToRemove =new ArrayList<>();
        for (String i : words){
            if (i.length() == length ){
                elementsToRemove.add(i);
            }
        }
        words.removeAll(elementsToRemove);
    }

    public List<String> getWords() {
        return words;
    }
}
