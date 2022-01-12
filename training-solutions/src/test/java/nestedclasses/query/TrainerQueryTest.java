package nestedclasses.query;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerQueryTest {
    List<Trainer> trainers = Arrays.asList(
            new Trainer("John Doe", 100),
            new Trainer("Jack Doe", 200),
            new Trainer("Jane Doe", 500)
    );
    @Test
    void testFindByName() {
        Trainer trainer = new TrainerQuery(trainers).findFirstByName("Jack Doe");
        assertEquals("Jack Doe", trainer.getName());
        assertEquals(200, trainer.getSalary());
    }

    @Test
    void testFindBySalary(){
        Trainer trainerSal = new TrainerQuery(trainers).findFirstBySalary(400);
        assertEquals("Jane Doe",trainerSal.getName());
        assertEquals(500,trainerSal.getSalary());

    }
    @Test
    void testFindByCriteria(){
        TrainerQuery.Criteria criteria = new TrainerQuery.NameCriteria("John Doe");
        Trainer trainer = new TrainerQuery(trainers).findFirst(criteria);
        assertEquals("John Doe",trainer.getName());
        assertEquals(100,trainer.getSalary());
    }
}
