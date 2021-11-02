package stringscanner;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class example {
    public static void main(String[] args) {
        Scanner scanner= new Scanner("aaa bbb ccc ddd");  // alapból
        List<String> list = new ArrayList<>();

        while (scanner.hasNext()){
            String str = scanner.next();
            System.out.println(str);
            list.add(str);
        }
        System.out.println(list);


        Scanner scr= new Scanner("11 12 13 14");  // alapból
        List<Integer> intList = new ArrayList<>();

        while (scr.hasNextInt()){
            int i = scr.nextInt();
            System.out.println(i);
            intList.add(i);
        }
        System.out.println(intList);

        Scanner scanner3= new Scanner("aaa, bbb, ccc, ddd").useDelimiter(",");  // alapból
        List<String> list3 = new ArrayList<>();

        while (scanner3.hasNext()){
            String str = scanner3.next();
            System.out.println(str);
            list3.add(str);
        }
        System.out.println(list3);
    }
}
