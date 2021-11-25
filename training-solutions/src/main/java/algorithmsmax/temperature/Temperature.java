package algorithmsmax.temperature;

import java.util.List;

public class Temperature {

    public int getMin(List<Integer> temperature){
        int minVal = Integer.MAX_VALUE;
        for (Integer i : temperature){
            if (i < minVal){
                minVal = i;
            }
        }
        return minVal;
    }
}
