package methodparam.marriage;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MarriageTest {

    @Test
    void testGetMarriage() {
        RegisterDate registerDateWoman = new RegisterDate("születés ideje", LocalDate.of(1989, 1, 11));
        Woman woman = new Woman("Nagy Luca", new ArrayList<>(Arrays.asList(registerDateWoman)));

        RegisterDate registerDateMan1 = new RegisterDate("születés ideje", LocalDate.of(1983, 10, 22));
        RegisterDate registerDateMan2 = new RegisterDate("házasságkötés ideje", LocalDate.of(2007, 4, 6));
        RegisterDate registerDateMan3 = new RegisterDate("válás ideje", LocalDate.of(2010, 7, 9));

        Man man = new Man("Kiss József", new ArrayList<>(Arrays.asList(registerDateMan1)));
        man.addRegisterDate(registerDateMan2);
        man.addRegisterDate(registerDateMan3);


        Marriage marriage = new Marriage();
        marriage.getMarried(woman, man);

        assertEquals("Kiss-Nagy Luca", woman.getName());
        assertEquals(4, man.getRegisterDates().size());
        assertEquals(LocalDate.now(), woman.getRegisterDates().get(1).getDate());
    }
}
