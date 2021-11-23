package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BooksTest {
    Books books = new Books();
    @TempDir
    File temporaryFolder;

    @Test
    void makeBetterFileTest() throws IOException {
        Path outputPath = temporaryFolder.toPath().resolve("books.txt");
        Path inputPath = Paths.get("src/test/resources/books.txt");

        List<String> expexted = new ArrayList<>();
        expexted.add("Gárdonyi Géza: Egri csillagok");
        expexted.add("Molnár Ferenc: Pál utcai fiúk");
        expexted.add("Fekete István: Tüskevár");
        expexted.add("Jókai Mór: Kőszívű ember fiai");

        new Books().makeBetterFile(inputPath, outputPath);

        List<String> lines = Files.readAllLines(outputPath);

        assertEquals(expexted,lines);
    }

    @Test
    void cannotReadFile(){
        Path outputPath = temporaryFolder.toPath().resolve("books.txt");
        Path inputPath = Paths.get("src/test/resources/book.txt");

        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> new Books().makeBetterFile(inputPath, outputPath));
        assertEquals("Can not read file",e.getMessage());
    }
}
