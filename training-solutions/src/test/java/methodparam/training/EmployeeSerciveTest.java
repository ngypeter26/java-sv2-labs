package methodparam.training;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeSerciveTest {
    @Test
    public void testCreateEmployee(){
        new EmployeeService().createEmployee("John Doe",1970,EmployeeType.FULL_TIME);
//        new EmployeeService().createEmployee(null,1970,,EmployeeType.FULL_TIME);
//        new EmployeeService().createEmployee("    ",1970,,EmployeeType.FULL_TIME);
//        new EmployeeService().createEmployee("John Doe",1899,,EmployeeType.FULL_TIME);
    }

    @Test
    public void testFind(){
        List<String> names = Arrays.asList("John Doe","Jane Doe","Jack Doe");

        Result result = new EmployeeService().findEmployee("Jane",names);

        assertEquals("Jane Doe",result.getName());
        assertEquals(1,result.getIndex());
    }

//    @Test
//    public void testFind(){
//        List<String> names = Arrays.asList("John Doe","Jane Doe","Jack Doe");
//
//        String name = new EmployeeService().findEmployee("Jane",names);
//
//        System.out.println(name);
//
//    }

    @Test
    public void testList(){
        List<String> names = new EmployeeService().listNames();

        for (String s : names){
            System.out.println(s);  //ha null, akkor NullPointException, ha ürews lista, akkor lefut
        }
    }

}
