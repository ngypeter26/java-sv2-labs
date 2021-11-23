package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Names {
    public static void main(String[] args) {
        Path pathWithDr = Paths.get("src/main/resources/introexceptionfinally/DrNames.txt");
        Path pathWithoutDr = Paths.get("src/main/resources/introexceptionfinally/DrNamesWithoutDr.txt");
        Path wrongPath = Paths.get("src/main/resources/introexceptionfinally/DrNamesWithoutD.txt");

        System.out.println(new Names().firstDr (pathWithDr));
        System.out.println(new Names().firstDr (pathWithoutDr));
        System.out.println(new Names().firstDr (wrongPath));
    }

    public String firstDr(Path path){
        List<String> names = new Names().readFile (path);

        for (String s : names){
            if (s.startsWith("dr.")){
                return s;
            }
        }
        return "";
    }

    public List<String> readFile (Path path) {
            try{
                return Files.readAllLines(path);
            }catch(IOException ioe){
                throw new IllegalStateException("Cannot read file",ioe);
            }finally{
                System.out.println("End of reading.");
            }
    }

}
