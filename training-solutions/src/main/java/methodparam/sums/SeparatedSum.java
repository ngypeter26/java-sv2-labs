package methodparam.sums;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SeparatedSum {

    public String readFromFile() {
        try {
            List<String> floatingNumbers = Files.readAllLines(Paths.get("src/main/resources/floatingnumbers.txt"));
            return floatingNumbers.get(0);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file, ioe");
        }
    }
    public Result sum(String floatingNumbers){
        double sumPlus = 0;
        double sumMinus = 0;
        String[] numbers = floatingNumbers.replace(',', '.').split(";");
        for (String s : numbers) {
            double number = Double.parseDouble(s);
            if (s.startsWith("-")) {
                sumMinus += number;
            } else {
                sumPlus += number;
            }
        }
        return new Result(sumPlus, sumMinus);
    }
}
