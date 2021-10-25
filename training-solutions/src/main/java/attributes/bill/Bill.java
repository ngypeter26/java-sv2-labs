package attributes.bill;

public class Bill {
    public static void main(String[] args) {
        String product = "beer";
        int price = 400;
        int quantity = 24;
        double vatPercent = 27;

        BillItem bill = new BillItem(product, price, quantity, vatPercent);

        System.out.println("Termék: " + bill.getProduct());
        System.out.println("Egységár: " + bill.getPrice());
        System.out.println("Mennyiség: " + bill.getQuantity());
        System.out.println("Áfa: " + bill.getVatPercent());
        System.out.println("Bruttó ár: " + bill.calculateTotalPrice());
    }
}
