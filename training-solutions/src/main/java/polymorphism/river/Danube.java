package polymorphism.river;

import java.util.Arrays;
import java.util.List;

public class Danube extends River{
    List<String> capitals;

    public Danube(String name, int length, List<String> capitals) {
        super(name, length);
        this.capitals = capitals;
    }

    public List<String> getCapitals() {
        return capitals;
    }

    public static void main(String[] args) {
        Water water = new Danube("Dunavíz",100, Arrays.asList("Pest"));


        River river = new Danube("Dunafolyó",500, Arrays.asList("Bécs","Pest"));
        System.out.println(river.getName());
        System.out.println(river.getLength());

        Danube danube = new Danube("Duna",1000, Arrays.asList("Bécs","Pozsony","Pest","Belgrád"));
        System.out.println(danube.getName());
        System.out.println(danube.getLength());
        System.out.println(danube.getCapitals());

    }
}
