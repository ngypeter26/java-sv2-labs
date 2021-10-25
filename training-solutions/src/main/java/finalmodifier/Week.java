package finalmodifier;

import java.util.Arrays;
import java.util.List;

public class Week {
    public static final List<String> weekDays = Arrays.asList("H","K","Sze","Cs","P","Szo","V");


    public static void main(String[] args) {
        int index = weekDays.indexOf("K");
        weekDays.set(index,"Sze");

        System.out.println(weekDays);
    }



}
