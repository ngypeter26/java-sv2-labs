package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {
    private String className;
    private Random random;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random random) {
        this.className = className;
        this.random = random;
    }

    public boolean addStudent(Student student){
        for (Student s : students){
            if (s.getName().equals(student.getName())){
                return false;
            }
        }
            students.add(student);
            return true;
    }

    public boolean removeStudent(Student student){
        for (Student s : students){
            if (s.getName().equals(student.getName())){
                students.remove(student);
                return true;
            }
        }
        return false;
    }
    public double calculateClassAverage(){
        double sum = 0;
        double count = 0;

        if (students.size()<1){
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }

        for (Student s : students){
            if(s.calculateAverage()>=1) {
                sum += s.calculateAverage();
                count++;
            }
        }
        if (count==0){
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
        return Math.round(sum / count *100) / 100.0;
    }
    public double calculateClassAverageBySubject(Subject subject){
        double sum = 0;
        double count = 0;

        if (students.size()<1){
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
        for (Student s : students){
            if(s.calculateSubjectAverage(subject)>=1) {
                count++;
                sum += s.calculateSubjectAverage(subject);
            }
        }
        if (count==0){
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
        return Math.round(sum / count *100) / 100.0;
    }
    public Student findStudentByName(String name){
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        if (students.size()<1){
            throw new IllegalStateException("No students to search!");
        }
        for (Student student : students){
            if (student.getName().equals(name)){
                return student;
            }
        }
        throw new IllegalArgumentException("Student by this name cannot be found! " + name);
    }
    public Student repetition(){
        if (students.size()<1){
            throw new IllegalStateException("No students to select for repetition!");
        }
            return students.get(random.nextInt(students.size()));
    }
    public List<StudyResultByName> listStudyResults(){
        List<StudyResultByName> studyResultByName = new ArrayList<>();
        for (Student student : students){
            studyResultByName.add(new StudyResultByName(student.getName(),student.calculateAverage()));
        }
        return studyResultByName;
    }

    public String listStudentNames(){
        StringBuilder sb = new StringBuilder(students.get(0).getName());

        for (int i = 1; i<students.size(); i++){
            sb.append(", ");
            sb.append(students.get(i).getName());

        }
        return sb.toString();
    }


    public String getClassName() {
        return className;
    }
}
