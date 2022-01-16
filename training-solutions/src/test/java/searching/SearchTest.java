package searching;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchTest {

    @Test
    public void testArraySearch() {
        int[] i = {1, 3, 5, 6, 7, 9, 12, 4};
        Arrays.sort(i);

        System.out.println(Arrays.binarySearch(i,2));// 2. helyen kéne lennie
        System.out.println(Arrays.binarySearch(i,6)); //4. helyen van

        assertEquals(3, Arrays.binarySearch(i, 5));
        assertTrue(Arrays.binarySearch(i, 20) < 0);
        assertEquals(-9,Arrays.binarySearch(i, 20) );

        // ha nincs rendezve
        int[] i2 = {1, 3, 5, 6, 7, 9, 12, 4};

        System.out.println(Arrays.binarySearch(i2,4));// -3, mert nem találja
        Arrays.sort(i2);
        System.out.println(Arrays.binarySearch(i2,4));// -3, mert nem találja

    }

    @Test
    public void testListSearch() {
        List<Integer> i = Arrays.asList(1, 3, 5, 6, 7, 9, 12);
        assertEquals(3, Collections.binarySearch(i, 6));

        assertTrue(i.contains(6));
        assertFalse(i.contains(20));

        assertTrue(i.containsAll(Arrays.asList(6,7)));
        assertFalse(i.containsAll(Arrays.asList(6,20))); // mert 20 nincs benne

        assertEquals(3,i.indexOf(6));
        assertEquals(-1,i.indexOf(20));

        assertEquals(1,Collections.min(i));
        assertEquals(12,Collections.max(i));

        List<Trainer> trainers = Arrays.asList(
                new Trainer("John", 3),
                new Trainer("Jack", 2),
                new Trainer("Jane", 1)
        );
        assertEquals("Jack", Collections.min(trainers).getName());
//
        assertEquals("Jane", Collections.min(trainers,
                new Comparator<Trainer>() {
                    @Override
                    public int compare(Trainer o1, Trainer o2) {
                        return o1.getSalary() - o2.getSalary();
                    }
                }).getName());
    }
}
