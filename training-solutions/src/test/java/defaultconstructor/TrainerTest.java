package defaultconstructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerTest {
    @Test
    public void testCreate(){
        Trainer trainer = new Trainer();
//        assertEquals(null,trainer.getName());
        assertEquals("anonym",trainer.getName());
    }
}
