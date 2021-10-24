package arrayofarrays;

import java.util.Arrays;

public class Triangular {
    int[][] triangularMatrix(int size){
        int[][] output = new int[size][];
        //System.out.println(output.length);
        //System.out.println(size);

        for (int i = 0; i < size; i++){
            output[i] = new int[i+1];
            for (int j = 0; j < i+1; j++) {
              //  System.out.print(i);
              //  System.out.print(j + " ");
              //  System.out.println(output[i][j]);
               // output[i][j] = i;
                Arrays.fill(output[i], i);
            }
            //System.out.println();
        }
        return output;
    }

    public static void main(String[] args) {
        int size = 8;
        Triangular triangular = new Triangular();

        int[][] matrix = triangular.triangularMatrix(size);

        // for-ral működik
//        for (int i = 0; i < matrix.length; i++){
//            for (int j = 0; j < matrix[i].length; j++ ){
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
        // for - each megoldás  -> működik
        for (int[] array : matrix){
            for (int number : array){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
