package collectionsset;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetTest {
    @Test
    public void testString() {
        Set<String> s = new HashSet<>();

       Collection<String> c = s;

       c.add("John");
       c.add("Jack");
       c.add("John");

        assertEquals(2, s.size());
//        assertEquals(Set.of("John"), s);
        for (String t : s){
            System.out.println(t);
        }
    }

    @Test
    public void testSet() {
        Set<Trainer> s = new HashSet<>();

        s.add(new Trainer("Jack"));
        s.add(new Trainer("Jack"));
        s.add(new Trainer("Jane"));

        assertEquals(2, s.size());
//        assertEquals(Set.of(new Trainer("Jack")), s);
        for (Trainer t : s){
            System.out.println(t.getName());
        }
    }

    @Test
    public void testSetOrder() {
        Set<Trainer> s = new LinkedHashSet<>();

        s.add(new Trainer("Jane"));
        s.add(new Trainer("Jack"));

        for (Trainer t : s){
            System.out.println(t.getName());
        }

        assertEquals(Arrays.asList(new Trainer("Jane"), new Trainer("Jack")), new ArrayList<>(s));
    }
}
