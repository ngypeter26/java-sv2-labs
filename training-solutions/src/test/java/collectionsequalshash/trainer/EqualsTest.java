package collectionsequalshash.trainer;

import org.junit.jupiter.api.Test;

public class EqualsTest {

    @Test
    void testEquals(){
        String s = "John";
        String s2 = "John";
        System.out.println(s==s2);

        Trainer trainer = new Trainer("John Doe");
        Trainer trainer2 = new Trainer("John Doe");
        System.out.println(trainer==trainer2);
        System.out.println(trainer.equals(trainer2));
    }

    @Test
    void testHAshCode(){
        Trainer trainer1 = new Trainer("john Doe","ilzhvbuzfvg");
        Trainer trainer2 = new Trainer("john Doe","ilzhvbuzfvg");
        Trainer trainer3 = new Trainer("john Doe","ilzhvbuzfva");
        System.out.println(trainer1);
        System.out.println(trainer2);
        System.out.println(trainer3);

    }
}
