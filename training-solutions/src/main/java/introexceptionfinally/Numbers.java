package introexceptionfinally;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1;

        while(number%2==1){
            System.out.println("Adj meg egy számot!");
            try{
                number =Integer.parseInt( scanner.nextLine());
            }catch(NumberFormatException nfe){
                throw new IllegalArgumentException("Nem számot adtál meg!",nfe);
            }finally{
                System.out.println("End of round.");
            }
        }


    }



}
