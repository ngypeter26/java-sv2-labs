package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Measurement {
    public List<String> readFromFile(Path path){
        try{
            return Files.readAllLines(path);
        }catch(IOException ioe){
            throw new IllegalStateException ("Can not read file.",ioe);
        }
    };

    public List<String> validate(List<String> lines){
        List<String> faultLines = new ArrayList<>();
        String[] lineArray;
        int number;
        double measuredValue;
        String name ;

        for (String line : lines){
            try{
                lineArray = line.split(",");
                number = Integer.parseInt(lineArray[0]);
                measuredValue = Double.parseDouble(lineArray[1]);
                name = lineArray[2];
                if(!isNameValid(name)){
                    faultLines.add(line);
                }
                if(!isLengthValid(lineArray)){
                    faultLines.add(line);
                }
            }catch(NumberFormatException | ArrayIndexOutOfBoundsException nfe){
                faultLines.add(line);
            }


        }
        return faultLines;
    }

    public boolean isNameValid(String name){
        name = name.trim();
        return name.indexOf(" ")>0;
    }
    public boolean isLengthValid(String[] lineArray){
        return lineArray.length==3;
    }

}
