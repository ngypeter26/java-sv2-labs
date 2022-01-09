package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<UniStudent> uniStudentList = new ArrayList<>();

    public void addStudent(UniStudent uniStudent){
        uniStudentList.add(uniStudent);
    }
    public boolean areEqual(UniStudent uniStudent, UniStudent anotherUniStudent){
        String neptun1 = uniStudent.getNeptun();
        String neptun2 = anotherUniStudent.getNeptun();
        String OMId1 = uniStudent.getOMId();
        String OMId2 = anotherUniStudent.getOMId();
        if (neptun1.isEmpty()){
            return false;
        }else if (OMId1.isEmpty()) {
            return false;
        }else {
            return neptun1.equals(neptun2) && OMId1.equals(OMId2);
        }
    }

    public List<UniStudent> getStudentList() {
        return uniStudentList;
    }

    @Override
    public String toString() {
        return "University{" +
                "studentList=" + uniStudentList +
                '}';
    }
}
