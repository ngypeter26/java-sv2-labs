package collectionsequalshash;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String tajNumber;

    public Person(String name, int age, String tajNumber) {
        this.name = name;
        this.age = age;
        this.tajNumber = tajNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTajNumber() {
        return tajNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(tajNumber, person.tajNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tajNumber);
    }

    public static void main(String[] args) {
        Person person1 = new Person("John Doe",32,"01234567");
        Person person2 = new Person("Jane Doe",40,"01234567");

        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}
