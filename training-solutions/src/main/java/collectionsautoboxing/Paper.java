package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Paper {
    private Map<String,Integer> paper = new HashMap<>();

    public Map<String, Integer> getPaper() {
        return paper;
    }

    public void putFurtherPaper(String className, int kilogramms){
        int actualKg =paper.containsKey(className) ? paper.get(className): 0;
        paper.put(className,actualKg + kilogramms);
    }

    public String getWinnerClass(){
        int maxWeight = 0;
        String winnerClass = null;

        for (String name : paper.keySet()){
            if (paper.get(name) > maxWeight){
                winnerClass = name;
                maxWeight = paper.get(name);
            }
        }
        return winnerClass;
    }

    public int getTotalWeight(){
        int totalWeight = 0;
        for (int value : paper.values()){
            totalWeight += value;
        }
        return totalWeight;
    }
}
