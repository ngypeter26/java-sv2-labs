package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameTest {

    @Test
    void testReadNames(){
        String fileName = "src/main/resources/introexceptionreadfiletestjunit5/names.txt";
        List<String> fileContent = new Names().readNames(Paths.get(fileName));
        List<String> expected = Arrays.asList("Joe", "Jack","Jane");
        assertEquals(expected,fileContent);
    }
}
