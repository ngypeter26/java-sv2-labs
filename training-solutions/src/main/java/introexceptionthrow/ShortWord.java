package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShortWord shortWord = new ShortWord();

        System.out.println("Adj meg egy legfeljebb 5 betűs szót!");
        String word = scanner.nextLine();

        if (shortWord.isShort(word)){
            throw new IllegalArgumentException("Not short");
        }
        if (shortWord.containOnlyLetters(word)){
            throw new IllegalArgumentException("Nem csak betűből áll");
        }
        System.out.println(word);
    }

    public boolean containOnlyLetters(String word){
        char[] wordChar = word.toCharArray();
        boolean answer = true;
        for (char i : wordChar){
            if (!Character.isAlphabetic(i)){
                answer = false;
            }
        }
        return !answer;
    }

    public boolean isShort(String word){
        return word.length() >5;
    }

}
