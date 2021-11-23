package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/resources/introexceptionfinally/names.txt");
//        Path path = Paths.get("src/main/resources/names.txt");
        List<String> names = new Example().readNames(path);
        System.out.println(names);
    }

    private List<String> readNames(Path path) {
        //Finally ággal
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        finally {
            System.out.println("End of read");
        }
        // második megoldás
//        try {
//            List<String> names =  Files.readAllLines(Paths.get("names.txt"));
//            System.out.println("End of read");// kivételnél ez nem fut le
//            return names;
//        }
//        catch (IOException ioe) {
//            System.out.println("End of read");// így kódismétlés
//            throw new IllegalStateException("Can not read file", ioe);
//        }
    }
}
