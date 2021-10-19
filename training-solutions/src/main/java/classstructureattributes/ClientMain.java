package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        //példányosítás
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();
        //beolvasás
        System.out.println("What is your name?");
        client.name = scanner.nextLine();

        System.out.println("What is your birth year?");
      //  option = Integer.parseInt(input.nextLine());
     //   client.year = scanner.nextInt();
        client.year = Integer.parseInt(scanner.nextLine());

    //    getClass().getName();

       // String var =	getAttributeTypeName(client.year);

        System.out.println("What is your address?");
        client.address = scanner.nextLine();
        //kiírás
        String newLine = System.getProperty("line.separator");

        int age = 2019 - client.year;
        System.out.println("Your name is:" + newLine + client.name );
        System.out.println("Your birth year is:" + newLine + client.year );
        System.out.println("Your age is:" + newLine +  age );
        System.out.println("Your address is:" + newLine + client.address );




    }


}
