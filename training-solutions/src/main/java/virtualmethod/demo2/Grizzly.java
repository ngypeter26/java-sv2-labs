package virtualmethod.demo2;

public class Grizzly  extends Bear {
    public void eat() {
        System.out.println("Grizzly is eating.");
    }

    public static void main(String[] args) {
        Grizzly grizzly = new Grizzly();
        grizzly.hunt();             //Bear is hunting. Grizzly is eating.
        grizzly.eat();              //Grizzly is eating.
    }
}
