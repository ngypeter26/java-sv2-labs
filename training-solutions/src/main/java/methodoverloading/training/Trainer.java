package methodoverloading.training;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private String name;

    private int age;

    private List<Course> courses = new ArrayList<>();

//    public interfaces.video.Trainer(String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void addCourse(String name) {
        courses.add(new Course(name));
    }

    public void addCourse(String name, int index) {
        courses.add(index,new Course(name));
    }

    public void addCourse(Course course) {
        courses.add(course);
    }


    public Course findCourseByName(String name) {
        for (Course course: courses) {
            if (course.getName().equals("name")) {
                return course;
            }
        }
        throw new IllegalArgumentException("Not found with name: " + name);
    }

    public List<Course> findCoursesBetween(char start, char end) {
        List<Course> courses = new ArrayList<>();
        for (Course course: this.courses) {
            if (course.getName().toLowerCase().charAt(0) >= start && course.getName().toLowerCase().charAt(0) <= end) {
                courses.add(course);
            }
        }
        return courses;
    }

}
