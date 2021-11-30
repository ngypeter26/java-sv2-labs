package methodchain;

public class Word {

    private char[] word;

    public Word(String word) {
        this.word = word.substring(0,4).toCharArray();
    }

    public Word changeToUpperCase(int i) {
        word[i] = Character.toUpperCase(word[i]);
        return this;
    }

    public Word changeToX(int i) {
        word[i] = 'x';
        return this;
    }
    public Word changeToY(int i) {
        word[i] = 'y';
        return this;
    }

    public String getWord() {
        return new String(word);
    }
}
