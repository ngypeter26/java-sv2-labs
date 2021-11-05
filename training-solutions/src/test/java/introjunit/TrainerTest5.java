package introjunit;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerTest5 {

   @Test
    void testCreate(){
       //Given
       Trainer trainer = new Trainer("John Doe");
       //When
       String name = trainer.getName();
       //Then
       assertEquals("John Doe",name);
   }

}
