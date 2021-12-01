package methodoverloading.training;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerTest {
    @Test
    public void testCreate(){
        // láncolás nélkül
        Trainer trainer = new Trainer();
        trainer.addCourse("Course1");
        trainer.addCourse("Course2",0);
        trainer.addCourse(new Course("Course3"));

        assertEquals("Course1",trainer.getCourses().get(1).getName());
        assertEquals("Course3",trainer.getCourses().get(2).getName());
    }
}
