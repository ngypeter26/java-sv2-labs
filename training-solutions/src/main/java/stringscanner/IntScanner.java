package stringscanner;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class IntScanner {
    String convertInts(String ints){
        Scanner scanner = new Scanner(ints).useDelimiter(";");
        List<Integer> intList = new ArrayList<>();

        while (scanner.hasNextInt()){
            int i = scanner.nextInt();
            if (i>100){intList.add(i);}
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< intList.size();i++){
            if (i>0){sb.append(",");}
            sb.append(intList.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        IntScanner intScanner = new IntScanner();

        System.out.println(intScanner.convertInts( "5;3;107;12;123;18;198")); // több szám, több 100nál nagyobb
        System.out.println(intScanner.convertInts( "5;3;12;18;19")); // több szám, nincs 100nál nagyobb
        System.out.println(intScanner.convertInts( "")); // üres string
        System.out.println(intScanner.convertInts( "198")); // egy 100nál nagyobb szám


    }
}
