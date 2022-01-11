package exceptionresource.hiddenword;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HiddenWord {




    public String  getHiddenWord(Path path){
        StringBuilder sb = new StringBuilder();

        try(Scanner scanner = new Scanner(path)){
            while(scanner.hasNextLine()){
                 sb.append(getLetter(scanner.nextLine()).get(0));
            }
        }catch(IOException ioe){
            throw new IllegalStateException("Can not read file");
        }
        return sb.toString();
    }

    private List<Character> getLetter(String line){
        char[] lineArray = line.toCharArray();
        List<Character> letters = new ArrayList<>();
        for (char c : lineArray){
            if(Character.isAlphabetic(c)){
                letters.add(c);
            }
        }
        if (letters.size()==0){
            letters.add(' ');
        }
        return letters;

    }
}
