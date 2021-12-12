package abstractclass.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerTest {
    @Test
    public void testCreateHuman(){
        Human human = new Trainer("John Doe",30,Arrays.asList(new Course("matek")));
        human.work();

        Trainer trainer = new Trainer("John Doe",30,Arrays.asList(new Course("matek")));
        trainer.work();
    }

    @Test
    public void testCreateTrainer(){
//        Trainer trainer = new Trainer("John Doe",12, Arrays.asList(new Course("Curse1")));
//        assertEquals(4,trainer.getFreeTime());
    }

}
