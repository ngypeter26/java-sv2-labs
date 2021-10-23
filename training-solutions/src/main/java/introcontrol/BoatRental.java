package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a csoport létszámát!");
        int number = scanner.nextInt();
        int marad = number;
        boolean csonak5 = false;
        boolean csonak3 = false;
        boolean csonak2 = false;

        if (marad >= 5){
            System.out.println("Elvitték az 5-ös csónakot!");
            marad = marad - 5;
            csonak5 = true;
        }
        if (marad >=3 ){
            System.out.println("Elvitték az 3-ös csónakot!");
            marad = marad - 3;
            csonak3 = true;
        }
        if (marad > 0 ){
            System.out.println("Elvitték az 2-es csónakot!");
            marad = marad - 2;
            csonak2 = true;
        }

        System.out.println("Elvitték " +
                (csonak5 ? "az ötös " : "") + (csonak5 && (csonak3 | csonak2) ? "," : "") +
                (csonak3 ? "a hármas " : "") +
                (csonak2 ? "a kettes " : "") + "csónakot " +
                (marad > 0 ? "és maradt " + marad +" személy a parton" : "."));
    }
}
