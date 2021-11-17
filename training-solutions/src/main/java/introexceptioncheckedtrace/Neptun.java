package introexceptioncheckedtrace;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Neptun {
    public static void main(String[] args) {
        List<String> neptunCodes = new ArrayList<>();
        try {
            List<String> fileContent = new Neptun().readCsv();

            for (String i : fileContent){
                neptunCodes.add(i.substring(1+i.indexOf(",")));

            }
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }

        System.out.println(neptunCodes);

    }

    public List<String> readCsv() throws IOException{
        return Files.readAllLines(Paths.get("src/main/resources/introexceptioncheckedtrace/neptun.csv"));

    }
}
