package arrayofarrays;

import javax.crypto.AEADBadTagException;
import java.time.Month;
import java.time.YearMonth;

public class DailyValues {
    int[][] getValues(){
        int [][] output = new int[12][];

        for (int i = 0;  i < output.length; i++){
            //output[i] = new int[];
            YearMonth yearMonthObject = YearMonth.of(2021, i+1);
            int daysInMonth = yearMonthObject.lengthOfMonth(); //28

            output[i] = new int[daysInMonth];
            //System.out.println(output[i].length);
            //System.out.println(daysInMonth);
            for (int j = 0; j < output[i].length; j++ ){
                output[i][j] = j+1;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        DailyValues dailyValues = new DailyValues();

        int[][] milesz = dailyValues.getValues();

        ArrayOfArrays arrayOfArrays = new ArrayOfArrays();

        arrayOfArrays.printArrayOfArrays(milesz);
    }
}
