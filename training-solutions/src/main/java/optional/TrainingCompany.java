package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TrainingCompany {
    private List<Course> courses;

    public TrainingCompany(List<Course> courses) {
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return new ArrayList<>(courses);
    }

    public Course getCheaperCourse(int maxPrice){
        Optional<Course> course = Optional.empty();
        for (Course c : courses){
            if (c.getPrice()<maxPrice){
                course = Optional.of(c);
//                break;
            }
        }
        return course.orElseThrow(() -> new IllegalArgumentException("No such course."));
    }
    public int getPriceOfCourseWithGivenNameAndLevel(String name, Level level){
        Optional<Course> course = Optional.empty();
        for (Course c : courses){
            if (c.getName().equals(name)&&c.getLevel().equals(level)){
                course = Optional.of(c);
//                break;
            }
        }
        return course.orElseThrow(() -> new IllegalArgumentException("No such course.")).getPrice();
    }
    public String getNameOfCourseWithGivenLevel(Level level){
        Optional<String> courseName = Optional.empty();
        for (Course c : courses){
            if (c.getLevel().equals(level)){
                courseName = Optional.of(c.getName());
//                break;
            }
        }
        return courseName.orElse("Sorry, there is no course at this level.");
    }

}
