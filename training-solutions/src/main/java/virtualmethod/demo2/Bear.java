package virtualmethod.demo2;

public class Bear {
    public void hunt() {
        System.out.println("Bear is hunting.");
        eat();
    }

    protected void eat() {
        System.out.println("Bear is eating.");
    }
}
