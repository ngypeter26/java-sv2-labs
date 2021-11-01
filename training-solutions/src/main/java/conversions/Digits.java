package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {
    private List<Integer> list= new ArrayList<>();

    public void addDigitsToList(String text){
        char[] charArray = text.toCharArray();
        String charActString;
        System.out.println(charArray);
        for (char i : charArray){
            if (Character.isDigit(i)){
                charActString = Character.toString(i);
                list.add( Integer.parseInt(charActString)) ;
            }
        }
    }

    public List<Integer> getList() {
        return list;
    }

    public static void main(String[] args) {
        Digits digits = new Digits();
        digits.addDigitsToList("b12chg5k7");
        System.out.println(digits.getList());
    }
}
