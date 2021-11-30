package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WomanTest {
    @Test
    void testCreate() {
        RegisterDate registerDate = new RegisterDate("születés ideje", LocalDate.of(1989, 1, 11));
        Woman woman = new Woman("Nagy Luca", new ArrayList<>(Arrays.asList(registerDate)));

        assertEquals("Nagy Luca", woman.getName());
        assertEquals(1, woman.getRegisterDates().size());
        assertEquals(LocalDate.of(1989, 1, 11), woman.getRegisterDates().get(0).getDate());
    }
}
