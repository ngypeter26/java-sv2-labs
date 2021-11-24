package algorithmssum.school;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchoolTest {


    @Test
    void getNumberOfStudentsTest(){
        List<Integer> headcounts = Arrays.asList(25,30,28,32,18);

        int actual = new School().getNumberOfStudents(headcounts);

        assertEquals(133,actual);

    }

}
