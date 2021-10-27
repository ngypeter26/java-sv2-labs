package references.dogs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Kennel {
    public static void main(String[] args) {
        List<Dog> dogs= new ArrayList<>();

        Dog dog1 = new Dog("Tasli",2,"brown");
        Dog dog2 = new Dog("Muffin",1,"black");
        Dog dog3 = new Dog("Kolbász",3,"white");

        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);

        System.out.println(dogs);

        Dog dog4 = dogs.get(1);
        dog4.setColour("blue");

        System.out.println(dogs);

        Dog dog5 = new Dog("Dog5",12,"green");
        System.out.println(dog5);
        dog5 = dogs.get(0);
        System.out.println(dog5);

        dogs.add(dog5);
        System.out.println(dogs);

        Dog dog6 = dog4;
        dog6.setColour("nem tudom");
        System.out.println(dogs);

        List<Dog> dogs2 = dogs;




    }

}
