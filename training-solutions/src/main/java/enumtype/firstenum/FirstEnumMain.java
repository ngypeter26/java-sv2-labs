package enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {
    public static void main(String[] args) {
        // egyenként
        for(Continent i : Continent.values()){
            System.out.println(i);
        }
        System.out.println("");
        // tömbben
        Continent[] continents = Continent.values();
        System.out.println(Arrays.toString(continents));

        for (Ocean i : Ocean.values()){
            System.out.println(Ocean.valueOf(i.name()));
        }
        System.out.println("");

        for (Football i : Football.values()){
            System.out.println(i.name());
        }
    }
}
