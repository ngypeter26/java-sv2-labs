package collectionscomp;

import org.junit.jupiter.api.Test;

import java.text.Collator;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainersTest {
    @Test
    void testSort(){
        List<String> names = Arrays.asList("John","Jack","Jane");

        Collections.sort(names);
        System.out.println(names);

        assertEquals(Arrays.asList("Jack","Jane","John"),names);


    }
    @Test
    void testTrainers(){
        List<Trainer> trainers = Arrays.asList(
              new Trainer("John",3),
              new Trainer("Jack",2),
              new Trainer("Jane",1)
        );
        Collections.sort(trainers);
        System.out.println(trainers);
        assertEquals(trainers.get(0).getName(),"Jack");

//        Collections.sort(trainers,new SalaryComparator());
//        System.out.println(trainers);
//        assertEquals(trainers.get(0).getName(),"Jane");


        Collections.sort(trainers, new Comparator<Trainer>() {
            @Override
            public int compare(Trainer o1, Trainer o2) {
                return o1.getSalary() - o2.getSalary();
            }
        });
        System.out.println(trainers);
        assertEquals(trainers.get(0).getName(),"Jane");

        Collections.sort(trainers, new Comparator<Trainer>() {
            @Override
            public int compare(Trainer o1, Trainer o2) {
                return o1.getName().length() - o2.getName().length();
            }
        });
    }

    public class SalaryComparator implements Comparator<Trainer> {
        @Override
        public int compare(Trainer o1, Trainer o2) {
            return o1.getSalary() - o2.getSalary();
        }
    }

    @Test //ékezetes
    void testSortWithAccutes(){
        List<String> names = Arrays.asList("John","Jack","Jane","Ábel","éva","jack");

        Collections.sort(names);
        System.out.println(names);

        Collections.sort(names, Collator.getInstance(new Locale("hu","HU")));
        System.out.println(names);

        assertEquals(Arrays.asList("Ábel","éva","jack","Jack","Jane","John"),names);


    }
}
