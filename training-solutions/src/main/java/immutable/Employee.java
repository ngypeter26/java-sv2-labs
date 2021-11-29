package immutable;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private final String name;
    private final int yearOFBirth;

    private final List<String> courses;

    public Employee(String name, int yearOFBirth, List<String> courses) {
        this.name = name;
        this.yearOFBirth = yearOFBirth;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public int getYearOFBirth() {
        return yearOFBirth;
    }

    public List<String> getCourses() {
        //return courses;  // így tudom később módosítani
        //return new ArrayList<>(courses);  // így másolom
        return List.copyOf(courses);  // így másolom
    }
    // nem tudok settert csinálni

}
