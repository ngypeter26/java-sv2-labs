package introexceptionreadfile;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.Files;

public class Shopping {

    public static void main(String[] args) {
        try {
            List<String> shoppingList = Files.readAllLines(Paths.get("src/main/resources/introexceptionreadfile/shoppinglist.txt"));
            for (String i : shoppingList){
                System.out.println(i);
            }
        }
        catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }

    }
}
