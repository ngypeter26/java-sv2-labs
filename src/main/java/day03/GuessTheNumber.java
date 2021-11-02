package day03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int computerNumber = random.nextInt(1,100);

        Scanner scanner = new Scanner(System.in);
        int tipp;
        boolean succes = false;
        for (int i=0; i<6; i++){
            System.out.println("Add meg a(z) " + (i+1) + ". tippet!");
            tipp = scanner.nextInt();
            if (tipp < computerNumber){
                System.out.println("A megoldás nagyobb");
            }else if (tipp > computerNumber){
                System.out.println("A megoldás kisebb");
            }else{
                System.out.println("A szám helyes");
                i = 6;
                succes = true;
                System.out.println("Gratulálok, eltaláltad!");
            }
        }

        if (!succes){
            System.out.println("Sajnálom, nem találtad el. A helyes válasz: " + computerNumber);
        }
    }
}




