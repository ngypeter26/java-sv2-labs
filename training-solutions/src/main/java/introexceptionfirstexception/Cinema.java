package introexceptionfirstexception;

import java.util.Random;
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a neved!");
        String name = scanner.nextLine();

        System.out.println("Add meg a film címét!");
        String title = scanner.nextLine();

        System.out.println("Hány jegyet kérsz?");
        int numberOfTickets = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Melyik sorba kéred?");
        int rowNumber = scanner.nextInt();
        scanner.nextLine();

        Random random = new Random();
        int firstSeat = random.nextInt(1,30-numberOfTickets);

        StringBuilder sb = new StringBuilder("Vásárló neve: " );
        sb.append(name + "\n");
        sb.append("Film címe: ");
        sb.append(title + "\n");
        sb.append("Lefoglalt helyek: ");
        for (int i = 1; i<numberOfTickets; i++){
            sb.append(rowNumber);
            sb.append(". sor ");
            sb.append(firstSeat+i-1);
            sb.append(". szék,");
        }
        sb.append(rowNumber);
        sb.append(". sor ");
        sb.append(firstSeat + numberOfTickets-1);
        sb.append(". szék");

        System.out.println(sb);
    }
}
