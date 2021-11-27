package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VowelsTest {
    @Test
    void getNumberOfVowels(){
        String word1 = "repülő";
        String word2 = "autó";
        String word3 = "llkla";
        String word4 = "kjhgf";

        assertEquals(3,new Vowels().getNumberOfVowels(word1));
        assertEquals(3,new Vowels().getNumberOfVowels(word2));
        assertEquals(1,new Vowels().getNumberOfVowels(word3));
        assertEquals(0,new Vowels().getNumberOfVowels(word4));
    }
}
