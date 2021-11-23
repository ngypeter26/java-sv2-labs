package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Books {

    public void makeBetterFile(Path inputPath,Path outputPath){
        List<String> inputBooks = readFile(inputPath);
        List<String> readableBooks = new ArrayList<>();
        String athor;
        String title;

        for (String i : inputBooks) {
            String[] temp = i.split(";");
            athor = temp[2];
            title = temp[1];
            readableBooks.add(athor + ": " + title);
        }
        writeFile( outputPath,readableBooks);
    }

    public List<String> readFile(Path path){
        try {
            return Files.readAllLines(path);
        }catch(IOException ioe){
           throw new IllegalArgumentException("Can not read file",ioe);
        }
    }

    public void writeFile(Path path,List<String> content){
        try {
            Files.write(path,content);
        }catch(IOException ioe){
            throw new IllegalArgumentException("Can not write file",ioe);
        }
    }

}
