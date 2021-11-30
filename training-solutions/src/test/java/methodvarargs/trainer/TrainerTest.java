package methodvarargs.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerTest {

    @Test
    public void testAddCourse(){
        Trainer trainer = new Trainer ("Jöhn Doe");
        trainer.addCourse("Course1");
//        trainer.addCourses(Arrays.asList("C1","C2","C3"));
        trainer.addCourses("C1","C2","C3");
        assertEquals(4,trainer.getCourses().size());
    }
}
