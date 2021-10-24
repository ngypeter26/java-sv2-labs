package looptypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroup {

    void printStudyGroups(List<String> students){
        List<String> group1 = new ArrayList<>();
        List<String> group2 = new ArrayList<>();

        for (String student : students){
            if ( student.length() <= 10){
                group1.add(student);
            }else{
                group2.add(student);
            }
        }
        System.out.println("Első csoport: " + group1);
        System.out.println("Második csoport: " + group2);
    }

    public static void main(String[] args) {
        List<String> group = Arrays.asList("Kiss Laci","Nagy Péter", "Ábrahám Izsák" , "Vezetéknév Keresztnéc", "Jóska Pista");

        StudyGroup studyGroup = new StudyGroup();

        studyGroup.printStudyGroups(group);
    }

}
