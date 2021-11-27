package algorithmsdecision.towns;

import java.util.List;

public class Town {
    public boolean containsFewerHabitants(List<Integer> towns, int max){
        for (Integer town : towns){
            if (town < max){
                return true;
            }
        }
        return false;
    }
}
