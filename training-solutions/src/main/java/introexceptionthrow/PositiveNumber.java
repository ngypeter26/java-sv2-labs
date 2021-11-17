package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adj meg egy pozitív számot!");
        String numberString = scanner.nextLine();

        try {
            int number = Integer.parseInt(numberString);
            if (number < 0) {
                throw new IllegalArgumentException("Not positiveee!");
            }
            System.out.println(number);
        }
        catch (NumberFormatException nfe) {
            System.out.println("Nincs ilyen szám: " + numberString);
        }

//        Megoldás
//         char[] chars = numberString.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (!Character.isDigit(chars[i])) {
//                throw new IllegalArgumentException("Not a positive number: " + numberString);
//            }
//        }
    }
}
