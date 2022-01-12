package genericsusage;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestGenericUSage {
    @Test
    void testGenericsUsage(){
        List l = new ArrayList<>();
        l.add("John Doe");
        l.add("Jane Doe");
        l.add(10);

        Object o = l.get(0);
        String s = (String) l.get(0);
        System.out.println(s);

        List<String> l2 = new ArrayList<>();
//        List<Object> l3 = l2; nem működik
        Collection<String> l3 = l2;
    }
}
