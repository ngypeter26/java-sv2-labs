package algorithmstransformation.algorithmstransformation;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TransformationTest {
    @Test
    void testNames(){
        List<Trainer> trainers = new ArrayList<>();
        trainers.add(new Trainer("John Doe",1970));
        trainers.add(new Trainer("Jill Doe",1980));

        List<String> names = new Transformation().toNames(trainers);
        System.out.println(names);

        assertEquals(2,names.size());
        assertEquals("Jill Doe",names.get(1));
    }

    @Test
    void testNamesYearOfBefore(){
        List<Trainer> trainers = new ArrayList<>();
        trainers.add(new Trainer("John Doe",1970));
        trainers.add(new Trainer("Jill Doe",1980));
        trainers.add(new Trainer("Jack Doe",1977));
        trainers.add(new Trainer("Jim Doe",1974));

        List<String> namesBefore = new Transformation().toNamesYearOfBirthBefore(trainers,1975);
        System.out.println(namesBefore);
        assertEquals(2,namesBefore.size());
        assertEquals("Jim Doe",namesBefore.get(1));
    }
}
