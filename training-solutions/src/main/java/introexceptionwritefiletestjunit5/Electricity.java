package introexceptionwritefiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Electricity {

    private List<String> renovation = new ArrayList<>();

    private List<String> getRenovationList() {
        List<String> renovation = new ArrayList<>(Arrays.asList(LocalDate.now().toString()));
        renovation.add("Neszmélyi út");
        renovation.add("Fehérvári út");
        renovation.add("MEnyecske utca");
        renovation.add("Valami utca");
        renovation.add("Bánat utca");
        return renovation;
    }

    public void writeStreets(Path path){
        try {
            Files.write(path, getRenovationList());
        }catch(IOException ioe){
            throw new IllegalStateException("Cannot write file",ioe);
        }
    }
}
