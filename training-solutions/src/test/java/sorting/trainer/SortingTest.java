package sorting.trainer;

import com.sun.source.tree.Tree;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingTest {

    @Test
    void testSortArray(){
        int[] i = {3,1,6,9,5,3};
        Arrays.sort(i);
        int[] expected = {1,3,3,5,6,9};
        assertEquals(Arrays.toString(expected),Arrays.toString(i));
    }
    @Test
    void testSortList(){

        List<Integer> i = Arrays.asList(3,1,6,9,5,3);
        Collections.sort(i);
        List<Integer> expected = Arrays.asList(1,3,3,5,6,9);
        assertEquals(expected,i);

        i = Arrays.asList(3,1,6,9,5,3);
        i.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1-o2;
                return o2-o1; // csökkenő sorrend
            }
        });
        List<Integer> expected2 = Arrays.asList(9,6,5,3,3,1);
        assertEquals(expected2,i);
    }
        @Test
         void testSet(){
            Set<String> s = new TreeSet<>(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.length()-o2.length();
                }
            });
            s.add("Jack");
            s.add("Joe");
            s.add("Jane");
            System.out.println(s);
        }


}
