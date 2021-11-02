package formatlocaleprintf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Thanks {
    public static void main(String[] args) {
//        List<String> persons = new ArrayList<>();
        List<String> persons = Arrays.asList("Kis Pista","Nagy Zoltán","Szabó Alajos");

        for (String i : persons){
            System.out.printf("Kedves %s! Örülünk, hogy termékünket választotta!",i);
            System.out.println();
        }



    }
}
