package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;

public class PaulStreetBoys {
    public static void main(String[] args) {
        String fileName = "src/main/resources/introexceptioncause/palutcaifiuk.txt";

        List<String> nameList = new PaulStreetBoys().readFile(fileName);

        new PaulStreetBoys().getNames(nameList,"nemecsek");
//        new PaulStreetBoys().getNames(nameList,"");

    }

    public List<String> readFile(String fileName){
        try{
            return Files.readAllLines(Paths.get(fileName));
        }catch(IOException ioe){
            throw new IllegalStateException("A fájl nem található",ioe);
        }
    }
    public void getNames(List<String> nameList,String name){
        if (name.trim().isEmpty() || name == null){
            for (String i : nameList){
                    System.out.println(i);
                }
        }else{for (String i : nameList){
            if (i.toLowerCase().contains(name.toLowerCase())){
                System.out.println(i.toLowerCase());
            }else{
                System.out.println(i);
            }
        }}


    }
}
