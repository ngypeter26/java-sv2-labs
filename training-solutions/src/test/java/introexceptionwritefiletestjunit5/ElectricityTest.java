package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElectricityTest {
@TempDir
File temporaryFolder;

@Test
    void writeStreetsTest() throws IOException {
    Path path = temporaryFolder.toPath().resolve("streets.txt");
    System.out.println(path);
    List<String> renovation = new ArrayList<>();
    renovation.add("2021-11-23");
    renovation.add("Neszmélyi út");
    renovation.add("Fehérvári út");
    renovation.add("MEnyecske utca");
    renovation.add("Valami utca");
    renovation.add("Bánat utca");

    new Electricity().writeStreets(path);
    List<String> lines = Files.readAllLines(path);
    assertEquals(renovation,lines);
}



}
