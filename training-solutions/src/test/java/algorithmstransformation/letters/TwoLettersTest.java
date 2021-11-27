package algorithmstransformation.letters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoLettersTest {
    @Test
    void getFirstTwoLettersTest(){
        List<String> words = Arrays.asList("alma", "körte", "barack", "eper", "szilva");
        List<String> expected = Arrays.asList("al", "kö", "ba", "ep", "sz");

        assertEquals(expected,new TwoLetters().getFirstTwoLetters(words));

    }

}
