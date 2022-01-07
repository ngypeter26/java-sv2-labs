package interfacestaticmethods.training;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AudetedTest {

    @Test
    void testFind(){
        List<Audited> values = new ArrayList<>();
        values.add(new Employee("John Doe", LocalDateTime.of(2019,1,10,00,01,1)));
        values.add(new Employee("Jane Doe", LocalDateTime.of(2019,2,10,00,01,1)));

        Audited audited = Audited.findLastCreated(values);
        assertEquals("Jane Doe",((Employee)audited).getName());
    }
}
