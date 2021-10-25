package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Students {
    List<Integer> students = new ArrayList<>();

    public void addHeight(int height){
        students.add(height);
    }

    public boolean isHeightsIncreasing(){
        boolean output = true;
        int maxHeight = 0;
        for (int student : students){
            if (student >= maxHeight){
                maxHeight = student;
            }
            else{
                output = false;
                //return false; -> így is működik
            }
        }
        return output;
    }

}
