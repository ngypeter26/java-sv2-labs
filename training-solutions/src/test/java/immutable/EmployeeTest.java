package immutable;

import org.junit.jupiter.api.Test;
import java.util.List;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    public void testEmployeeImmutable(){
        List<String> courses = new ArrayList<>();
        courses.add("java");
        courses.add("python");
        Employee employee = new Employee("John doe",1970,courses);

        employee.getCourses().add("C#");
        assertEquals(2,employee.getCourses().size());// 3 lesz, mert referencia
    }
}
