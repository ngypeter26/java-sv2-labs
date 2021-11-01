package conversions;

public class TooBigNumber {


    long getRightResult(int number){
        return ((long)number) +  2_147_483_647;
    }

    public static void main(String[] args) {
        TooBigNumber tooBigNumber = new TooBigNumber();
        System.out.println(tooBigNumber.getRightResult(12));
    }
}
