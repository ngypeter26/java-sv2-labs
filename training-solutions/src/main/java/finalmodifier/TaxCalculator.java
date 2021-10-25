package finalmodifier;

public class TaxCalculator {
    public static final double AFA=27;

    double tax(double price){
        return price * 27 /100;
    }
    double priceWithTax(double price){
        return price * (100+27) /100;
    }

    public static void main(String[] args) {
        double price = 200;
        System.out.println("Az áfa: " + new TaxCalculator().tax(price));
        System.out.println("A bruttó ár: " + new TaxCalculator().priceWithTax(price));
    }
}
