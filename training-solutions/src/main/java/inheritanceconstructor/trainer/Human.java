package inheritanceconstructor.trainer;

public class Human {
    public static final int DEFAULT_FREE_TIME = 4;
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public Human() {    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getFreeTime() {
        return DEFAULT_FREE_TIME;
    }
}
