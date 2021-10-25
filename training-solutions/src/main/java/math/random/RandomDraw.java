package math.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        int numberOfPersons = 10;

        for (int i = 0; i < numberOfPersons; i++){
            names.add("Person" + (i+1));
        }
        System.out.println(names);

        Random random = new Random();

        int win1 = random.nextInt(1,5);
        int win2 =random.nextInt(6,10);

        System.out.println("Az első nyertes: " + names.get(win1));
        System.out.println("Az második nyertes: " + names.get(win2));
    }
}
