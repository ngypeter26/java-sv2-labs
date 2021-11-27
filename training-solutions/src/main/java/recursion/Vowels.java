package recursion;


import java.util.Arrays;
import java.util.List;

public class Vowels {
    List<String> vovels = Arrays.asList("a", "e", "i"," o", "ö", "u", "ü","á", "é", "í", "ó", "ő", "ú", "ű");
    public int getNumberOfVowels(String word){
        if (word.length()>1){
            int subWord = getNumberOfVowels( word.substring(1));
            int firstLetter = getNumberOfVowels(  word.substring(0,1));
            return subWord + firstLetter;
        } else if (word.length()==1){
            return vovels.contains(word) ? 1 : 0;
        }else {
            return 0;
        }
    }
}
