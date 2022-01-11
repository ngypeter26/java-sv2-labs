package exceptionresource.siblings;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Siblings {


    public List<String> getFullNames(String lastName, Path path){
        List<String> fullNames = new ArrayList<>();
        try(Scanner scanner = new Scanner(path)){
            while(scanner.hasNextLine()){
                fullNames.add(lastName + " " + scanner.nextLine());
            }
        }catch(IOException ioe){
            throw new IllegalStateException("Can not read file");
        }
        return fullNames;
    }
}
