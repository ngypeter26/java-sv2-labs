package constructoroverloading.trainer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testTrainer {
    @Test
    void testCreate(){
        Trainer trainer = new Trainer("John Doe");
        assertEquals("John Doe",trainer.getName());
        assertEquals(20,trainer.getAge());

        Trainer trainer2 = new Trainer("John Doe",2);
        assertEquals("John Doe",trainer2.getName());
        assertEquals(2,trainer2.getAge());

    }
}
