package virtualmethod.demo1;

import java.util.Arrays;
import java.util.List;

public class Trainer extends Human {

    private List<Course> courses;

    public Trainer(String name, List<Course> courses){
        super(name);
        this.courses=courses;
    }

    @Override
    public int getFreeTime() {
        return Math.max(super.getFreeTime() - courses.size(), 0);
    }

    public static void main(String[] args) {

        //1
        Human human = new Human("John Doe");
        System.out.println(human.getFreeTime());

        List<Course> courses = Arrays.asList(new Course("mathematics"), new Course("physics"));

        //2
        Trainer trainer = new Trainer("Jack Doe", courses);
        System.out.println(trainer.getFreeTime());

        //3
        Human anotherTrainer = new Trainer("Jane Doe", courses);
        System.out.println(anotherTrainer.getFreeTime());
    }
}