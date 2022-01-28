package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lottery {

    public List<Integer>  selectWinningNumbers(int lotteryType, int ballCount){
        List<Integer> balls = new ArrayList<>();
        for (int i = 1; i<=ballCount;i++){
            balls.add(i);
        }
        Random random = new Random();
        Collections.shuffle(balls,random);
        if (lotteryType>=ballCount){
            throw new IllegalArgumentException("There must be more balls than the winning numbers!");
        }

        return balls.subList(0, lotteryType);
    }

    public List<Integer>  selectWinningNumbers(int lotteryType, int ballCount,Random random){
        List<Integer> balls = new ArrayList<>();
        for (int i = 1; i<=ballCount;i++){
            balls.add(i);
        }
        Collections.shuffle(balls,random);
        if (lotteryType>=ballCount){
            throw new IllegalArgumentException("There must be more balls than the winning numbers!");
        }

        return balls.subList(0, lotteryType);
    }
}
