package stringseparate;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IceCream {
    public static void main(String[] args) {
        List<String> iceCream = Arrays.asList("csoki", "vanília", "eper", "citrom", "puncs");
        StringBuilder sb = new StringBuilder("Ma kapható:");

        for (int i = 0; i < iceCream.size(); i++) {
            sb.append(iceCream.get(i));
            if (i < (iceCream.size()-1)) {
                sb.append(", ");
            }
        }
        sb.append(". Gyerekeknek féláron!");
        System.out.println(sb);
    }


}
