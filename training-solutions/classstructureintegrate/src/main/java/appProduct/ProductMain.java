package appProduct;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the product?");
        String name = scanner.nextLine();

        System.out.println("What is the price?");
        int price = scanner.nextInt();

        Product product = new Product(name,price);

        System.out.println("What is the price increase?");
        product.increasePrice(scanner.nextInt());


        System.out.println("What is the price decrease?");
        product.decreasePrice(scanner.nextInt());

        System.out.println("Actual price of " + product.getName() + " is: " + product.getPrice());

    }
}
