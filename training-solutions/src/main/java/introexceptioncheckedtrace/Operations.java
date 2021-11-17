package introexceptioncheckedtrace;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class Operations {

    public List<String> readFile()throws IOException {
        String path = "src/main/resources/introexceptioncheckedtrace/underground.txt";
        return Files.readAllLines(Paths.get(path));
    }

    public String getDailySchedule(List<String> fileContent){
        LocalDate today = LocalDate.now();
        StringBuilder sb = new StringBuilder(today + ",");
        for (String i : fileContent){
            if (i.startsWith("2")){
                sb.append(" ");
                sb.append(i);
            }

        }
        return sb.toString();
    }
}
