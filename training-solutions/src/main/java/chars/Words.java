package chars;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Words {
    public String pushWord(String word){
        char[] outputChar = word.toCharArray();
        for (int i=0 ; i < outputChar.length; i++){
           // outputChar[i]=(char) (word.charAt(i)+1);
            outputChar[i] +=1;
        }
       return  new String(outputChar);
    }

    public static void main(String[] args) {
        Words word = new Words();
        System.out.println(word.pushWord("alma"));

    }
}
