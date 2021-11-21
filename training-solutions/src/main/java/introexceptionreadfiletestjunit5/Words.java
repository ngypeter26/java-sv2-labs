package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Words {
    public String getFirstWordWithA(Path path){
        String fileName = "src/main/resources/introexceptionreadfiletestjunit4/words.txt";
        List<String> fileContent =  readFile(Paths.get(fileName));

        for (String i : fileContent){
            if (i.startsWith("a")){
                return i;
            }else{
                return "a";
            }
        }
        return "alma";
    }
    public List<String> readFile (Path path){
        try{
            return Files.readAllLines(path);
        }catch(IOException ioe){
            throw new IllegalStateException("nincs ilyen file",ioe);
        }
    }
}
