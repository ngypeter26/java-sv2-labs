package algorithmstransformation.students;

import java.util.ArrayList;
import java.util.List;

public class PrimarySchool {
    private List<Person> everybody;

    public PrimarySchool(List<Person> everybody) {
        this.everybody = everybody;
    }

    public List<Person> getEverybody() {
        return everybody;
    }
    public void addPerson(Person person){
        everybody.add(person);
    }
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();

        for (Person person : everybody){
            if (person.getAge() >= 6 && person.getAge() <= 14) {
                Student student = new Student(person.getName(), person.getAddress());
                students.add(student);
            }
        }
        return students;
    }
}
