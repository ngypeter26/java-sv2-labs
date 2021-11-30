package methodchain;

public class ModifiedWord {
    public String modify(String word){
        return new Word(word).changeToUpperCase(0).changeToX(1).changeToUpperCase(2).changeToY(3).getWord();
    }
}
