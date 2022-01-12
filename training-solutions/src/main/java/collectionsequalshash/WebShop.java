package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WebShop {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public int findHowMany(Product product) {
        int count = 0;
        for (Product p : products) {
            if (p.equals(product)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        WebShop webShop = new WebShop();
        webShop.addProduct(new Product("sör", "1234"));
        webShop.addProduct(new Product("kérműves sör", "3456"));
        webShop.addProduct(new Product("borsodi", "1234"));
        webShop.addProduct(new Product("bor", "6789"));
        webShop.addProduct(new Product("kőbányai", "1234"));

        System.out.println(webShop.findHowMany(new Product("ászok", "1234")));
    }
}
