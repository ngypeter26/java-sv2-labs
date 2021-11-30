package methodvarargs.trainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private List<Course> courses = new ArrayList<>();


    public Trainer(String name) {
        this.name = name;
    }

    public void addCourse(String name){
        courses.add(new Course(name));
    }

    // régen
//    public void addCourses(List<String> names){
//        for (String name : names){
//        courses.add(new Course(name));
//        }
//    }

//    public void addCourses(String...names){
//        for (String name : names){
//        courses.add(new Course(name));
//        }
//    }
    public void addCourses(String s1, String...names){  // Így lehet kényszeríteni, hogy min 1-et megadj
        courses.add(new Course(s1));
        for (String name : names){
            courses.add(new Course(name));
        }
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }
}
