package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerBuilderTest {

    @Test
    public void build(){
        TrainerBuilder trainerBuilder = new TrainerBuilder()
                .withName("John Doe").withAge(30);
        Trainer trainer = trainerBuilder.build();

        assertEquals("John Doe",trainer.getName());


    }
}
