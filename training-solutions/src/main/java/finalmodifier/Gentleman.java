package finalmodifier;

public class Gentleman {
    final String MESSAGE_PREFIX = "Hello ";
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    String sayHello(String name){
        return MESSAGE_PREFIX + name ;
    }

    public static void main(String[] args) {
        Gentleman gentleman = new Gentleman();

        System.out.println(gentleman.sayHello("Péter"));
        System.out.println(gentleman.sayHello("Ákos"));


    }
}


