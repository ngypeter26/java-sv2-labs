package junit5assert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrainerTest {
    @Test
    void testCreate(){
        Trainer trainer = new Trainer("John",1_000_000,null);
        assertEquals("John",trainer.getName());

        assertNotNull(trainer.getName());
        assertNull(trainer.getLessonByTheDay());

        Trainer anotherTrainer = trainer;
        Trainer anotherTrainer2 = new Trainer("John",1_000_000,null);

        assertSame(trainer,anotherTrainer);
        assertNotSame(trainer,anotherTrainer2);

        assertTrue(trainer.getName().contains("John"));
        assertFalse(trainer.getName().contains("Doe"));
    }

    @Test
    void testLessonsByTheDay(){
        Trainer trainer = new Trainer("John",1200000, new int[] {5, 4, 3, 2});
        assertArrayEquals(new int[] {5, 4, 3, 2},trainer.getLessonByTheDay());
    }


    @Test
    void testSalaryByMonth(){
        Trainer trainer = new Trainer("John",1_000_000,null);
        double salary = trainer.getSalaryByTheMonth();
        assertEquals(83333.333333,salary,0.00001);
    }
}
