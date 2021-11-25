package algorithmsmax.hill;

import java.util.List;


public class Hill {
    public int getMax(List<Integer> peaks){
        int maxVal = Integer.MIN_VALUE;

        for (Integer i : peaks){
            if (i > maxVal) {
                maxVal = i;
            }
        }
        return maxVal;
    }
}
