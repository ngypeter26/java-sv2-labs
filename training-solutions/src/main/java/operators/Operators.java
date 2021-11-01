package operators;

public class Operators {

    boolean isEven(int n){
//        if (n%2 == 0) {
//            return true;
//        }else {
//            return false;
//        }
        return n % 2 == 0;
    }

    String getResultOfDivision(int number, int divisor){
        return number + " / " + divisor + " = " + (number / divisor) +
                ", maradék: " +  (number % divisor);
    }

    String isNull(String s){
//        System.out.println(s);
        return s == null ?  "null értékű"  : " nem null értékű";
    }
    boolean isEmpty(String s){
//        System.out.println(s);
        return s == null || s.length()==0;
    }

}
