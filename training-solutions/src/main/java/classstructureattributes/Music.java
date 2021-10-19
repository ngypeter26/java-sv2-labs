package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song favoriteSong = new Song();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the data of your favorite song!");
        System.out.println("Band:");
        favoriteSong.band = scanner.nextLine();
        System.out.println("Title:");
        favoriteSong.title = scanner.nextLine();
        System.out.println("Length (in minutes):");
        favoriteSong.length = scanner.nextInt();

        String newLine = System.getProperty("line.separator");

        System.out.println("You favorite song is: " + newLine +
                favoriteSong.band + " - " +
                favoriteSong.title +
                " (" +  favoriteSong.length + " perc)");
    }
}
