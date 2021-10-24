package arrays;

import java.time.YearMonth;
import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        // órai anyag

        int[] a1 = {3,2,1};
        int[] a2 = {3,2,1};

        int[][] b1 = {{1}, {1,2},{1,2,3}};
        int[][] b2 = {{1},{1,2},{1,2,3}};

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.deepToString(b1));

        System.out.println(Arrays.equals(a1,a2));
        System.out.println(Arrays.deepEquals(b1,b2));

        Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));

        System.out.println(Arrays.toString(Arrays.copyOfRange(a1,1,3)));

        // Hónap napjainak száma
        ArraysMain arraysMain = new ArraysMain();
        System.out.println("A hónapok napjainak száma: " + arraysMain.numberOfDaysAsString());
        // Szorzótábla
        System.out.println();
        int size = 5;
        System.out.println("A(z) " + size +" x " + size + " méretű szorzótábla" + "\n"+
                arraysMain.multiplicationTableAsString(size));

        // hőmérséklet mérés
        double[] day1 = {10,12,15,20,18,15};
        double[] day2 = {10,12,15,20,18,15};
        double[] day3 = {10,12,15,22,18,15};
        System.out.println("Day 1 and Day 2 equals:  " + arraysMain.sameTempValues(day1,day2));
        System.out.println("Day 1 and Day 3 equals:  " + arraysMain.sameTempValues(day1,day3));

        // hőmérséklet mérés
        double[] day7 = {10,12,15,20,18,15,12};
        double[] day8 = {10,12,15,20,18,15,12,10};
        double[] day9 = {10,12,15,20,18,15,12,10,8};
        System.out.println("Day 7 and Day 8 equals:  " + arraysMain.sameTempValuesDaylight(day7,day8));
        System.out.println("Day 7 and Day 9 equals:  " + arraysMain.sameTempValuesDaylight(day7,day9));

        // lottó
        int[] drawnNumbers = {24,34,24,14,79};
        int[] takenNumbers = {48,26,17,70,81};
        String answer = arraysMain.wonLottery(takenNumbers,drawnNumbers) ? "nyert" : "sajnos nem nyert";
        System.out.println("Ön " + answer);
        System.out.println(Arrays.toString(takenNumbers));
        System.out.println(Arrays.toString(drawnNumbers));

    }
    String numberOfDaysAsString(){
        int[] numberOfDay = new int[12];
                for (int i = 0; i<12;i++){
                    YearMonth yearMonthObject = YearMonth.of(2021, i+1);
                    numberOfDay[i] = yearMonthObject.lengthOfMonth(); //28
                }
        return Arrays.toString(numberOfDay);
    }
    String multiplicationTableAsString(int size){
        int[][] multiplicationTable = new int[size][size];

        for (int i = 0; i < multiplicationTable.length ; i++){
            for (int j = 0; j < multiplicationTable[i].length ; j++){
                multiplicationTable[i][j]=(i + 1) * (j + 1);
            }
        }
        return Arrays.deepToString(multiplicationTable);
    }

    boolean sameTempValues(double[] day, double[] anotherDay){
        return Arrays.equals(day, anotherDay);
    }
    boolean sameTempValuesDaylight(double[] day, double[] anotherDay){
        int numberOfHours = Math.min(day.length,anotherDay.length);
        double[] day1 = Arrays.copyOfRange(day,0,numberOfHours);
        double[] day2 = Arrays.copyOfRange(anotherDay,0,numberOfHours);
        //System.out.println("day1: " + day1.length + "day2:" + day2.length);
        return Arrays.equals(day1, day2);
    }
    boolean wonLottery(int[] takenNumbers, int[]drawnNumbers){
        int [] takenNumbersCopy = Arrays.copyOf(takenNumbers,takenNumbers.length);
        int [] drawnNumbersCopy = Arrays.copyOf(drawnNumbers,drawnNumbers.length);
        Arrays.sort(takenNumbersCopy);
        Arrays.sort(drawnNumbersCopy);
        System.out.println(Arrays.toString(takenNumbersCopy));
        System.out.println(Arrays.toString(drawnNumbersCopy));

        return Arrays.equals(takenNumbersCopy,drawnNumbersCopy);
    }

}
