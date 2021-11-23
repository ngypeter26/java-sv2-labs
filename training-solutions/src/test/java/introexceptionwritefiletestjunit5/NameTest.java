package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameTest {
    @TempDir
    File temporaryFolder;

    @Test
    void writeNames() throws IOException {
        Path path = temporaryFolder.toPath().resolve("names.txt");
        System.out.println(path);
        List<Employee> employees =
                Arrays.asList(new Employee("John",1940), new Employee("Jack",1940), new Employee("Jane",1940));
        new Names().writeNames(employees, path);

        List<String> lines = Files.readAllLines(path);
        assertEquals(Arrays.asList("John", "Jack", "Jane"), lines);
    }
}
