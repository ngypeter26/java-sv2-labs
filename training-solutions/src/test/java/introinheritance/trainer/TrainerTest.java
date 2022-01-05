package introinheritance.trainer;

import org.junit.jupiter.api.Test;

public class TrainerTest {

    @Test
    void testCreate(){
        Trainer trainer = new Trainer();
        trainer.getAge(); // pedig üres a interfaces.video.Trainer osztály
        trainer.getCourses();

        Human human = new Trainer();

        Object object = new Trainer();
    }
}
