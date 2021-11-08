package controlselection.consonant;

import java.util.Locale;

public class ToConsonant {

    public String consonant(String letter){
        //letter = letter.toUpperCase();
        String alphabet  = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String vowel =  "AEIOU";
        String output = letter;
//        char[] alphabetChar = alphabet.toCharArray();
//        char[] vowelChar = vowel.toCharArray();

        if (vowel.contains(letter)){    // magánhangzó
            int index = alphabet.indexOf(letter);
            output = alphabet.substring(index+1,index+2);
            //return (char) (c + 1);
        }

        return output;
    }

    public static void main(String[] args) {
        ToConsonant toCons = new ToConsonant();

        System.out.println("a:" + toCons.consonant("a"));
        System.out.println("b:" + toCons.consonant("B"));
        System.out.println("e:" + toCons.consonant("e"));
        System.out.println("g:" + toCons.consonant("g"));
        System.out.println("o:" + toCons.consonant("o"));
    }
}
