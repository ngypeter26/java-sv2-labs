package collectionsclass;

import methodpass.window.WindowTest;
import org.junit.jupiter.api.Test;

import java.util.*;

public class CollectionTest {

    @Test
    void testCollections(){
//        List<Integer> l = Collections.emptyList();// nem módosítható
//        List<Integer> l = Collections.singletonList(1);// nem módosítható
//          l.set(0,2);  // nem változtatható

        List<Integer> elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        List<Integer> l = Collections.unmodifiableList(elements);
        System.out.println(l);

        l.add(3);
    }
    @Test
    void testReverse(){
        List<Integer> l = Arrays.asList(1,2,3,4);
        Collections.reverse(l);
        System.out.println(l);
    }
    @Test
    void testShuffle(){
        List<Integer> l = Arrays.asList(1,2,3,4);
        Random random = new Random(5);
        Collections.shuffle(l,random);
        System.out.println(l);
    }
}
