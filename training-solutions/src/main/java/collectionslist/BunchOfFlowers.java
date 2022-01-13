package collectionslist;

import java.util.LinkedList;

public class BunchOfFlowers {
    private LinkedList<String> bunch = new LinkedList<>();

    public void addFlower(String flower){
        bunch.add(flower);
    }
    public void addFlowerInTheMiddle(String flower){
        int index = bunch.size()/2;
        if (bunch.size()%2==0){
            index = bunch.size()/2;
            bunch.add(index,flower);
        }else{
            bunch.add(index,flower);
            bunch.add(index+2,flower);
        }
    }

    public LinkedList<String> getBunch() {
        return bunch;
    }
}
