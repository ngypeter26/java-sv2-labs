package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TankTest {

    @Test
    void modifyAngleTest(){
        Tank tank = new Tank();
        List<Integer> degrees = Arrays.asList(10,25,-23,7,-10);
        int result = 0;
        for (int i : degrees){
            tank.modifyAngle(i);
            result += i;
        }
        assertEquals(result,tank.getAngle());
    }

    @Test
    void exceptAngleTestLeft(){
        Tank tank = new Tank();
        List<Integer> degrees = Arrays.asList(10,25,-53,7,-10);
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () ->{
                    for (int i : degrees){
                        tank.modifyAngle(i);
                    }
        }
        );
        assertEquals("Bal oldalt ütközik",e.getMessage());
    }

    @Test
    void exceptAngleRight(){
        Tank tank = new Tank();
        List<Integer> degrees = Arrays.asList(10,25,-3,67,-10);
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () ->{
                    for (int i : degrees){
                        tank.modifyAngle(i);
                    }
                }
        );
        assertEquals("Jobb oldalt ütközik",e.getMessage());
    }


}
