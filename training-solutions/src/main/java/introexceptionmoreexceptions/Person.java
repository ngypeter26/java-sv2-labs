package introexceptionmoreexceptions;

import java.util.Locale;

public class Person {
    private String name;
    private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        String str = "name: " + name + "\n" +
                        "age: " + age;
        return str;
    }

    public static void main(String[] args) {
        Person person = new Person(null, 32);
        System.out.println(person.getName());
        System.out.println(person.getName().toUpperCase());
    }
}
