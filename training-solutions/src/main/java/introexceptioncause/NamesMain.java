package introexceptioncause;

import stringconcat.nameconcat.Name;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.Files;

public class NamesMain {
    public static void main(String[] args) {
//        try {
//            List<String> names = Files.readAllLines(Paths.get("src/main/resources/introexceptioncause/names.txt"));
//            System.out.println(names);
//        }
//        catch(IOException ioe){
//            System.out.println("Can not read file");
//            ioe.printStackTrace();
//        }
        String fileName ="src/main/resources/introexceptioncause/name.txt";

//        List<String> names = new NamesMain().readNames(fileName); // itt áll le. ezt is le lehet kezelni
        try {
            List<String> names = new NamesMain().readNames(fileName); // itt áll le. ezt is le lehet kezelni
            System.out.println(names);
        } catch (IllegalStateException ise){  // ide már a becsomagolt kell
            System.out.println("error: cannot read file ");

            System.out.println(ise.getCause());
            ise.getCause().printStackTrace();
        }

    }
    public List<String> readNames(String fileName){     // vagy ide throws IOException
        try {
            return Files.readAllLines(Paths.get(fileName));
        }
        catch(IOException ioe){
            throw new IllegalStateException("Cannot read file",ioe);
        }
        }
}
