package introexceptionreadfiletestjunit5;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class Names {

    public List<String> readNames (Path path){
        try{
            return Files.readAllLines(path);
        }catch(IOException ioe){
            throw new IllegalStateException("Cannot find file",ioe);
        }
    }
}
