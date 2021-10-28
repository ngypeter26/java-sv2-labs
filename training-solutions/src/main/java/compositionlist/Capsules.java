package compositionlist;

import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class Capsules {
    private List<String> colors = new ArrayList<>();  // példányosítom, így nem fix a mérete

    public void addLast(String newLast){
        colors.add(newLast);
    }

    public void addFirst(String newFirst){
//        if (colors.size() == 0){
//            colors.add(newFirst);
//        }
//        else {
            colors.add(0, newFirst);
//        }
    }

    public void removeFirst(){
        colors.remove(0);
    }

    public void removeLast(){
        colors.remove(colors.size()-1);
    }

    public List<String> getColors(){
        return colors;
    }

}
