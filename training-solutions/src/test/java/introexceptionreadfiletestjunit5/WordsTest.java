package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WordsTest {

    @Test
    void testReadFile(){
        String fileName = "src/main/resources/introexceptionreadfiletestjunit5/words.txt";
        List<String> fileContent =  new Words().readFile(Paths.get(fileName));

        List<String> expected = Arrays.asList("alma", "körte","Anna","barack","András", "szilva");

        assertEquals(expected,fileContent);
    }

    @Test
    void testGetFirstWordWithA(){
        String fileName = "src/main/resources/introexceptionreadfiletestjunit5/words.txt";
        String output =  new Words().getFirstWordWithA(Paths.get(fileName));

        assertEquals("alma",output);
    }

    @Test
    void testReadFileError(){
        String fileName = "src/main/resources/introexceptionreadfiletestjunit5/w.txt";
        IllegalStateException e = assertThrows(IllegalStateException.class,
                ()-> new Words().readFile(Paths.get(fileName)));

        assertEquals("nincs ilyen file",e.getMessage());
    }

}
