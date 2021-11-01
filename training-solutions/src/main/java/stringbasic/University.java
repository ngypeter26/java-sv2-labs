package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student){
        studentList.add(student);
    }
    public boolean areEqual(Student student, Student anotherStudent){
        String neptun1 = student.getNeptun();
        String neptun2 = anotherStudent.getNeptun();
        String OMId1 = student.getOMId();
        String OMId2 = anotherStudent.getOMId();
        if (neptun1.isEmpty()){
            return false;
        }else if (OMId1.isEmpty()) {
            return false;
        }else {
            return neptun1.equals(neptun2) && OMId1.equals(OMId2);
        }
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return "University{" +
                "studentList=" + studentList +
                '}';
    }
}
