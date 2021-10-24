package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourites {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> favouriteThings = new ArrayList<>();

        System.out.println("Add meg a kedvenc filmed!");
        favouriteThings.add(scanner.nextLine());

        System.out.println("Add meg a kedvenc színészed!");
        favouriteThings.add(scanner.nextLine());

        System.out.println("Add meg a kedvenc állatod!");
        favouriteThings.add(scanner.nextLine());

        System.out.println("A lista elemeit: " + favouriteThings);
        System.out.println("A lista hossza: " + favouriteThings.size());
    }
}
