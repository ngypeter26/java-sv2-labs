package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSevens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy számot!");

        int number = scanner.nextInt();
        scanner.nextLine();

        for (int i = number; i > 0;i++){
            if (i%7==0){
                System.out.println("X");
            }else{
                if (Integer.toString(i).contains("7")){
                    break;
                }else{
                    System.out.println(i);
                }
                }
            }

        }



}
