package looptypesmodify;

import java.util.ArrayList;
import java.util.List;

public class LanguageSchool {
    public static void main(String[] args) {

        List<Student> students  = new ArrayList<>();

        Student student1 = new Student("Kiss Laci");
        Student student2 = new Student("Nagy Péter");
        Student student3 = new Student("Ábrahám Izsák");
        Student student4 = new Student("Vezetéknév Keresztnév");
        Student student5 = new Student("Jóska Pista");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println("A csoport mérete: " + students.size());

        students.get(1).setActive(false);
        students.get(3).setActive(false);
        students.get(4).setActive(false);

        List<Student> studentsToRemove  = new ArrayList<>();

        for (Student student : students){
            if (!student.isActive()){
                studentsToRemove.add(student);
            }
        }

        students.removeAll(studentsToRemove);

        System.out.println("A csoport mérete: " + students.size());
    }
}
