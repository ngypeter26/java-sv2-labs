package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {


    public static void main(String[] args) {
        List<String> freezer = new ArrayList<>();

        freezer.add("alma");
        freezer.add("körte");
        freezer.add("szilva");
        freezer.add("vaj");
        freezer.add("sajt");

        System.out.println("az ételek: " + freezer);
        System.out.println("az ételek száma: " + freezer.size());

        freezer.remove("alma");
        freezer.remove("körte");

        System.out.println("az ételek: " + freezer);
        System.out.println("az ételek száma: " + freezer.size());
        //Freezer freezer = new Freezer();
    }


}
