package storageApp;

public class StoreMain {
    public static void main(String[] args) {
        Store beer = new Store("Beer");
        Store wine = new Store("Wine");

        System.out.println("Product: " + beer.getProduct());

        beer.store(1000);  //breewing
        System.out.println("Actual beer quantity: " + beer.getStock() + " l");

        beer.dispatch(100);  //batchelor party
        System.out.println("Actual beer quantity: " + beer.getStock() + " l");


        beer.dispatch(300);   // wedding
        System.out.println("Actual beer quantity: " + beer.getStock() + " l");


        beer.store(1000); //breewing
        System.out.println("Actual beer quantity: " + beer.getStock() + " l");

        System.out.println("Product: " + wine.getProduct());

        wine.store(200);  //delivery
        System.out.println("Actual wine quantity: " + wine.getStock() + " l");

        wine.dispatch(20);  //batchelor party
        System.out.println("Actual wine quantity: " + wine.getStock() + " l");


        wine.dispatch(50);   // wedding
        System.out.println("Actual wine quantity: " + wine.getStock() + " l");





    }
}
