package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {

    List<String> names = new ArrayList<>();

    boolean addStudent(String studentName){
        studentName = studentName.trim();
        if (studentName.indexOf(" ") >1){
            names.add(studentName);
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Journal journal = new Journal();

        System.out.println(journal.addStudent("Kis Pista"));
        System.out.println(journal.addStudent("Madonna"));

    }
}
