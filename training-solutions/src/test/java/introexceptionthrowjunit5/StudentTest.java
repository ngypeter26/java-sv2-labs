package introexceptionthrowjunit5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {
    @Test
    void testAdd(){
        List<Integer> notes = Arrays.asList(2,4,3,5,1);//given
        Student student = new Student();//when
        for (Integer i : notes) {
            student.addNote(i);
        }
        assertEquals(notes,student.getNotes());
    }

    @Test
    void testException(){
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> new Student().addNote(6));
        assertEquals("Note must be between 1 and 5!",e.getMessage());
    }


}
