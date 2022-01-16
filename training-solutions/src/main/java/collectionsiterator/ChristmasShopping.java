package collectionsiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChristmasShopping {
    private List<ChristmasPresent> presents = new ArrayList<>();

    public ChristmasShopping(List<ChristmasPresent> presents) {
        this.presents = presents;
    }

    public void addNewPresent(ChristmasPresent present){
        presents.add(present);
    }
    public void removeTooExpensivePresent(int maxPrice){
//        Iterator<ChristmasPresent> cp = presents.iterator();
//        while(cp.hasNext()){
//            ChristmasPresent nextCP = cp.next();
//            if(nextCP.getPrice()>maxPrice){
//                cp.remove();
//            }
//        }

        for (Iterator<ChristmasPresent> cp = presents.iterator();cp.hasNext();){
            ChristmasPresent nextCP = cp.next();
            if(nextCP.getPrice()>maxPrice){
                cp.remove();
            }
        }
    }

}
