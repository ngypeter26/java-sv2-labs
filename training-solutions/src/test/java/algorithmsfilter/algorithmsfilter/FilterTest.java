package algorithmsfilter.algorithmsfilter;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterTest {

    @Test
    void testFilteredByName(){
        List<Trainer> trainers = new ArrayList<>();
        trainers.add(new Trainer("John Doe",1970));
        trainers.add(new Trainer("Jill Doe",1980));
        trainers.add(new Trainer("Jack Doe",1972));
        trainers.add(new Trainer("Jim Smith",1978));
        trainers.add(new Trainer("Jane Doe",1992));

//        List<interfaces.video.Trainer> filteredTrainers = new Filters().filterByName(trainers,"Doe");
//        System.out.println(filteredTrainers);

        List<Trainer> filteredTrainers = new Filters().filterByName(trainers,"Ji");
        System.out.println(filteredTrainers);

        assertEquals(2,filteredTrainers.size());
        assertEquals("Jim Smith",filteredTrainers.get(1).getName());
        assertEquals("Jill Doe",filteredTrainers.get(0).getName());
    }

}
