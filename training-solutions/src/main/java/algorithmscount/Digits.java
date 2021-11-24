package algorithmscount;

public class Digits {

    public int getCountOfNumbers(){
        int count = 0;
        int firstDigit;
        int secondDigit;

        for (int i = 10 ; i<100; i++){
            firstDigit = i/10;
            secondDigit = i%10;
            if (Math.abs(firstDigit-secondDigit)==5){
                count++;
            }
        }
        return count;
    }
}
