package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RecipeTest {
    @Test
    void testReadFile(){
        String fileName = "src/main/resources/introexceptionreadfiletestjunit5/recipe.txt";
        List<String> fileContent =  new Recipe().readFile(Paths.get(fileName));

        List<String> expected = Arrays.asList("40 dkg liszt", "25 dkg margarin","10 dkg kristálycukor","1 egész tojás",
                "1 egész citrom", "1 csomag sütőpor","3 csomag vanillincukor",
                "1-2 evőkanál tejföl","2 kg alma","1 evőkanál fahéj");

        assertEquals(expected,fileContent);
    }

    @Test
    void testReadFileError(){
        String fileName = "src/main/resources/introexceptionreadfiletestjunit5/recie.txt";
        IllegalStateException e = assertThrows(IllegalStateException.class,
                ()-> new Recipe().readFile(Paths.get(fileName)));

        assertEquals("nincs ilyen file",e.getMessage());
    }

    @Test
    void testGetFirstWordWithA(){
        String fileName = "src/main/resources/introexceptionreadfiletestjunit5/recipe.txt";
        Recipe recipe = new Recipe();
        recipe.addIngredients(Paths.get(fileName));

        List<String> expected = Arrays.asList("liszt", "margarin","kristálycukor","tojás",
                "citrom", "sütőpor","vanillincukor",
                "tejföl","alma","fahéj");

        assertEquals(recipe.getIngredients(),expected);
    }
}
