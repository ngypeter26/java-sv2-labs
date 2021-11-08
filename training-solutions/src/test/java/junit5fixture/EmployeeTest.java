package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class EmployeeTest {
    Employee employee;
    @BeforeEach
    void initEmployee(){
        employee = new Employee("John Doe", 1970);  // construjktorral
    }

    @Test
    void testCreate(){
        assertEquals("John Doe",employee.getName());
    }

    @Test
    void testGetAge(){
        assertEquals(30,employee.getAge(2000));
    }

//    Employee employee;
//
//    @BeforeEach
//    void initEmployee() {
//        employee = new Employee("John Doe", 1970);
//    }
//
//    @Test
//    void testGetAge() {
//        assertEquals(49, employee.getAge(2019));
//    }
//
//    @Test
//    void testWithZeroAge() {
//        assertEquals(0, employee.getAge(1970));
//    }
}


