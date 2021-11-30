package methodchain;

public class ModifiedWord2 {

    private char[] word;

    public String modify(String word){
        return new ModifiedWord2().getFisrt4Letters(word).changeToUpperCase(0).changeToX(1).changeToUpperCase(2).changeToY(3).getWord();
    }

    public ModifiedWord2 getFisrt4Letters(String word) {
        this.word = word.substring(0,4).toCharArray();
        return this;
    }



    public ModifiedWord2 changeToUpperCase(int i) {
        word[i] = Character.toUpperCase(word[i]);
        return this;
    }

    public ModifiedWord2 changeToX(int i) {
        word[i] = 'x';
        return this;
    }
    public ModifiedWord2 changeToY(int i) {
        word[i] = 'y';
        return this;
    }

    public String getWord() {
        return new String(word);
    }
}
