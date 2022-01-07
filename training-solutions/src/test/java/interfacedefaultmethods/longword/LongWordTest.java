package interfacedefaultmethods.longword;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongWordTest {
    @Test
    void testLongWord(){
        String fileName = "src/test/resources/longword.txt";
        Path path = Paths.get(fileName);

        LongWord lw = new LongWord(path);

        assertEquals("LONGWORD",lw.getLongWord());

    }
}
