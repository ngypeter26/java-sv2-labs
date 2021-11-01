package stringbuilder;

import java.util.Locale;

public class PalindromeValidator {

    public boolean isPalindrome(String word){
        word = word.toLowerCase();
        StringBuilder wordSb = new StringBuilder(word);
        String wordReverse = wordSb.reverse().toString();

        return word.equals(wordReverse);
    }

    public static void main(String[] args) {
        PalindromeValidator palindromeValidator = new PalindromeValidator();

        System.out.println(palindromeValidator.isPalindrome("Racecar"));
        System.out.println(palindromeValidator.isPalindrome("start"));
        System.out.println(palindromeValidator.isPalindrome(""));
        System.out.println(palindromeValidator.isPalindrome("\n\t"));
    }
}
