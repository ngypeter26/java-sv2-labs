package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class NamesMain {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John","Jack","Jill");
        String fileName = "src/main/java/introexceptionwritefile/names.txt";
        try {
            Files.write(Paths.get(fileName), names);
        } catch(IOException ioe){
            System.out.println("cannot write file");
            ioe.printStackTrace();
        }

    }
}
