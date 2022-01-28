package collectionsclass;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    @Test
    void testSelectWinningNumbersWrongParameters() {
        int lotteryType = 6;
        int ballCount = 6;

        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new Lottery().selectWinningNumbers(lotteryType, ballCount));
        assertEquals("There must be more balls than the winning numbers!", ex.getMessage());
    }

    @Test
    void testSelectWinningNumbers() {
        //Given
        int lotteryType = 5;
        int ballCount = 90;
        //When
        List<Integer> winningNumbers = new Lottery().selectWinningNumbers(lotteryType, ballCount);
        //Then
        assertEquals(lotteryType, winningNumbers.size());
    }

    @Test
    void testShuffle(){
        int lotteryType = 5;
        int ballCount = 4;
        Integer[] a = new Integer[ballCount];
        for (int i = 0; i<ballCount;i++){
            a[i] = i;
        }
        List<Integer> l = Arrays.asList(a);
//        List<Integer> l = Arrays.asList(1,2,3,4);
        Random random = new Random(5);
        Collections.shuffle(l,random);
        System.out.println(l);
    }


    @Test
    void testWinningNumbers() {
        //Given
        int lotteryType = 5;
        int ballCount = 90;
        Random random = new Random(5);
        //When
        List<Integer> winningNumbers = new Lottery().selectWinningNumbers(lotteryType, ballCount,random);
        //Then
        System.out.println(winningNumbers);

       assertEquals(Arrays.asList(87, 3, 27, 7, 2), winningNumbers);
    }
}