package interfaces.animal;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestZoo {



    @Test
    void testZoo(){
        Animal animal1 = new Duck();
        Animal animal2 = new Lion();
        Duck animal3 = new Duck();
        Worm animal4 = new Worm();
        Lion animal5 = new Lion();
        Animal animal6 = new Lion();
        Animal animal7 = new Worm();

        List<Animal> animals = new ArrayList<>();
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        animals.add(animal5);
        animals.add(animal6);
        animals.add(animal7);

        Zoo zoo = new Zoo(animals);
        assertEquals(16,zoo.getNumberOfAllLegs());
        assertEquals(7,zoo.getNumberOfAnimals());



    }
}
