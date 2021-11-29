package methodpass.training;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    public void tryChangeValues(int yearOfBirth, String name, List<String> courses) {
        yearOfBirth = 1970;  //úgysem lesz visszahatása
        name = "John";  //úgysem lesz visszahatása
//        courses.add("Java");

        courses = new ArrayList<>();  // itt az eredeti refernciát elveszítjük, mert újat hozok létre
        courses.add("C#");

    }
}
