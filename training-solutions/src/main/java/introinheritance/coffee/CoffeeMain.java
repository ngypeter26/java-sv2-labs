package introinheritance.coffee;

public class CoffeeMain {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setName("Hosszú");
        coffee.setPrice(10);

        System.out.println(coffee.getName());
        System.out.println(coffee.getPrice());

        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setName("Lágy");
        cappuccino.setPrice(200);

        System.out.println(cappuccino.getName());
        System.out.println(cappuccino.getPrice());
    }
}
