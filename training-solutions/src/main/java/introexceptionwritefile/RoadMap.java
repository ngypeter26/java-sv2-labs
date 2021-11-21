package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RoadMap {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Kecskemét","Kiskunfélegyháza","Kistelek","Szeged");
        String fileName = "src/main/java/introexceptionwritefile/roadmap.txt";

        try {
            Files.write(Paths.get(fileName), cities);
        }catch(IOException ioe){
            System.out.println("nem sierült a kiírás");
            ioe.printStackTrace();
        }

    }
}
