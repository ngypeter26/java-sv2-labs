package introjunit;

public class Trainer {

    private String name;

    public Trainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getNameUpperCase() {
        return name.toUpperCase();
    }
}
