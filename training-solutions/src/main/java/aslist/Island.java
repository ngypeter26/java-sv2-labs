package aslist;

import java.util.Arrays;
import java.util.List;

public class Island {
    public static void main(String[] args) {
        List<String> importantThings = Arrays.asList("Tűzgyújtó","Svájci bicska", "Könyv");

        System.out.println("Ezeket vinnéd magaddal: " + importantThings);

        int replaceIndex = importantThings.indexOf("Könyv");

        importantThings.set(replaceIndex,"Kötél");

        System.out.println("Ezeket vinnéd magaddal: " + importantThings);
    }
}
