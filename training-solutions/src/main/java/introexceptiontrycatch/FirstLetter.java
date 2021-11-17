package introexceptiontrycatch;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class FirstLetter {
    public static void main(String[] args) {

        List input = Arrays.asList("ten","Tom","",10,"  ",null,"Peter",true, LocalDate.of(1998,10,26));
        for (int i = 0; i<input.size(); i++){
            try {
                System.out.println(input.get(i).toString().charAt(0));
            }
            catch(StringIndexOutOfBoundsException nfe){
                System.out.println("empty");
            }
            catch(NullPointerException nfe){
                System.out.println("null");
            }
        }

        List<String> words = Arrays.asList("ten","Tom","","  ",null,"Peter");
        for (String i : words){
            try {
                System.out.println(i.charAt(0));
            }
            catch(StringIndexOutOfBoundsException nfe){
                System.out.println("empty");
            }
            catch(NullPointerException nfe){
                System.out.println("null");
            }
        }
    }

}
