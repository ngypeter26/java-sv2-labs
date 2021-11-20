package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Poem {
    public static void main(String[] args) {
        String fileName = "src/main/resources/introexceptioncause/poem.txt";
        //throws IOException
//        try {
//           List<String> fileContent1 = new Poem().readFileThrows(fileName);
//            System.out.println(fileContent1);
//        }catch(IOException ioe){
//            System.out.println("Cannot read file ");
//        }


            List<String> fileContent2 = new Poem().readFile(fileName);

            for (String i : fileContent2){
                System.out.print(i.charAt(0) + " ");
            }


    }

    public List<String> readFileThrows(String fileName) throws IOException {
        return Files.readAllLines(Paths.get(fileName));
    }

    public List<String> readFile(String fileName){
        try {
            return Files.readAllLines(Paths.get(fileName));
        } catch(IOException ioe){
            throw new IllegalStateException("Cannot reach file", ioe);
        }

    }

}
