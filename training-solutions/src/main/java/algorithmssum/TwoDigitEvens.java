package algorithmssum;

public class TwoDigitEvens {

    public int getSum(){
        int sum = 0;
        for (int i = 11; i<100; i++){
            sum += i%2==1 && i%5 != 0 ? i : 0;
        }
        return sum;
    }
}
