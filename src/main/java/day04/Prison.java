package day04;

import java.util.ArrayList;
import java.util.List;
public class Prison {
    void openFreeCells(){
        int[] cells = new int[100];
        // feltöltöm a cellákat (0: zárva, 1 nyitva)
        for(int i = 0; i<100;i++){
            cells[i] = 0;
        }
        //megcsinálom a 100 napos programot
        for(int i = 1; i<100+1;i++){  //minden nap egyszer fordít
            for(int j = i; j<cells.length;j+=i){
                cells[j-1] +=1;
                cells[j-1] %=2;
            }
        }
        // összegyűjtöm a zártakat
        List<Integer> opencells = new ArrayList<>();
        for(int i=0; i<cells.length; i++){
            if (cells[i] == 1) {
                opencells.add(i + 1);
            }
        }
        System.out.println("Nyitott cellák:");
        System.out.println(opencells);
    }


}
