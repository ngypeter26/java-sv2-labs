package staticattrmeth.trainer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static staticattrmeth.trainer.Trainer.getNumberOFTrainers;

public class TrainerTest {

    @Test
    public void testCreate(){
        assertEquals(0,Trainer.numberOFTrainers);

        Trainer t = new Trainer("John Doe");
        assertEquals(1,Trainer.numberOFTrainers);

        Trainer t2 = new Trainer("John Doe");
        assertEquals(2,Trainer.numberOFTrainers);
        assertEquals(2,t2.numberOFTrainers);// osztály nevével minősítsünk!!
    }

//    @Test
//    public void testCreate2(){
//        assertEquals(0,Trainer.numberOFTrainers);
//
//        Trainer t = new Trainer("John Doe");
//        assertEquals(1,Trainer.numberOFTrainers);// ha teljet futtatod, akkor ezzel kezd, így 0 lesz, vigyázni kell!!
//    }

    @Test
    public void testCreate2(){
        assertEquals(0, getNumberOFTrainers()); // importálni kell

        Trainer t = new Trainer("John Doe");
        assertEquals(1,getNumberOFTrainers());

        Trainer t2 = new Trainer("John Doe");
        assertEquals(2, getNumberOFTrainers());
        assertEquals(2, getNumberOFTrainers());// osztály nevével minősítsünk!!
    }
}
