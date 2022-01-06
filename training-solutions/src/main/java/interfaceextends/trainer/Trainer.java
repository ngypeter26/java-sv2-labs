package interfaceextends.trainer;

public class Trainer implements HasNameAndAge{
    private String name;
    private int age;

    public Trainer(String name, int age ) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override  // ha HasNameAndAge akkor a getAge-t is implementálni kell
    public int getAge() {
        return age;
    }
}
