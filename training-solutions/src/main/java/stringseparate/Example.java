package stringseparate;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        //Megoldás annak vizsgálatával, hogy utolsó-e.
        List<String> names = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < names.size(); i++) {
            sb.append(names.get(i));
            if (i != (names.size() - 1)) {
                sb.append(", ");
            }
        }

//        //Megoldás annak vizsgálatával, hogy első-e.
//        List<String> names = new ArrayList<>();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < names.size(); i++) {
//            if (i != 0) {
//                sb.append(", ");
//            }
//            sb.append(names.get(i));
//        }
//        //For-each ciklussal:
//        List<String> names = new ArrayList<>();
//        StringBuilder sb = new StringBuilder();
//        boolean first = true;
//        for (String name: names) {
//            if (first) {
//                first = false;
//            }
//            else {
//                sb.append(", ");
//            }
//            sb.append(name);
//        }
    }

}
