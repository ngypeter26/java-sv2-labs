package collectionsmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ClassTrip {
    private Map<String,Integer> inpayments = new HashMap<>();

    public Map<String, Integer> getInpayments() {
        return inpayments;
    }

    public void loadInpayments(Path path){
        String line;
        try(Scanner scanner = new Scanner(path)){
            while(scanner.hasNextLine()){
                line = scanner.nextLine();
                loadMap(line);
            }
        }catch(IOException ioe){
            throw new IllegalStateException("Can not read file.");
        }
    }
    private void loadMap(String line){
        String[] fields = line.split(":");
        String name;
        int payment;
        if (fields.length != 2) {
            throw new IllegalArgumentException("Invalid line: " + line);
        }
        if (fields[0].trim().length() == 0) {
            throw new IllegalArgumentException("Empty name in line: " + line);
        }
        name = fields[0];
//        payment = Integer.parseInt(fields[1]);
        try{
            payment = Integer.parseInt(fields[1].trim());
        }
        catch (NumberFormatException iae){
            throw new IllegalArgumentException("The payment is invalid in line: " + line);
        }
        inpayments.put(name,payment);
    }

}
