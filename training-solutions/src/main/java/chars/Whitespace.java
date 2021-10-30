package chars;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Whitespace {
    public String makeWhitespaceToStar(String text){
        char[] outputTextChar = text.toCharArray();
        for(int i=0; i< text.length();i++){
            if (Character.isWhitespace(text.charAt(i))){
                outputTextChar[i] = '*';
            }
        }
        return new String(outputTextChar);
    }

    public static void main(String[] args) {
        Whitespace whiteSpace = new Whitespace();
        System.out.println(whiteSpace.makeWhitespaceToStar("lala baba sasa"));
    }
}
