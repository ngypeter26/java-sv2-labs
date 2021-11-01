package stringseparate;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Codes {
    String getCodesStartWithLetter(List<String> codes){
        StringBuilder sb = new StringBuilder();

        for (String i : codes){
            if ( Character.isAlphabetic(i.charAt(0))){
                if ((sb.length()>0)){
                    sb.append(", ");
                }
                sb.append(i);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        List<String> codeList = Arrays.asList("2T57fbj","T57fbj"," xtcu45", "xtcu45", "f578GVHd","+f578GVHd");

        Codes codes = new Codes();
        System.out.println(codes.getCodesStartWithLetter(codeList));

    }
}
