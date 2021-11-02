package formatlocaleprintf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {
    private String name;
    private List<Double> kms;

    public Run(String name) {
        this.name = name;
        kms = new ArrayList<>();
    }

    public void addRun(double km) {
        kms.add(km);
    }
    public void printFormattedRunText(){
        LocalDate date = LocalDate.now();
        String dateString = date.toString();
        String output = String.format("Kedves %s! A mai dátum: %s. Ezen a héten ez a(z) %d. futásod. Most %.1f km-t futottál. Csak így tovább!",name,dateString,kms.size(),kms.get(kms.size()-1));
        System.out.printf(output);
    }

    public static void main(String[] args) {
        Run runner = new Run("Joe Doe");
        runner.addRun(10.2);
        runner.addRun(1.2);
        runner.addRun(5.6);
        runner.addRun(12.8);

        runner.printFormattedRunText();

    }
}
