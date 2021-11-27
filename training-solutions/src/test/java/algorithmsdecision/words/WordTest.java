package algorithmsdecision.words;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordTest {

    @Test
    void containsLongerWordTest(){
        List<String> words = Arrays.asList("fesaa","      ","erwa","erw","kas");

        assertFalse(new Word().containsLongerWord(words,"almafaa"));
        assertFalse(new Word().containsLongerWord(words,"almafa"));
        assertTrue(new Word().containsLongerWord(words,"almaf"));
        assertTrue(new Word().containsLongerWord(words,"alma"));
    }
}
