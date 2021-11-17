package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Holiday {
    public static void main(String[] args) {

        try {
            List<String> holiday = Files.readAllLines(Paths.get("src/main/resources/introexceptionreadfile/holiday.txt"));
            for (String i : holiday) {
                System.out.println(i);
            }
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
