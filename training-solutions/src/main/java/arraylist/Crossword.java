package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Crossword {
    public static void main(String[] args) {

        List<String> wordList = Arrays.asList("KULCS", "KÁLYHA", "LÓ", "AJTÓ",
                                                "CSERESZNYEFA", "TEJ", "FELHŐ",
                                                "CIPŐ", "MOSODA", "KÁVÉTEJSZÍN",
                                                                "CITERA", "BABA");

        System.out.println(wordList);

        List<String> word6Letters = new ArrayList<>();

//        // for - ral
//        for (int i = 0; i < wordList.size(); i++ ){
////            System.out.println(wordList.get(i).length());
//            if (wordList.get(i).length() == 6) {
//                word6Letters.add(wordList.get(i));
//            }
//        }
        // for - each -el
        for (String str : wordList){
//            System.out.println(wordList.get(i).length());
            if (str.length() == 6) {
                word6Letters.add(str);
            }
        }

        System.out.println("6 betűs szavak: " + word6Letters);
//        String s = wordList.get(1);
//        System.out.println(s.length());
    }
}
