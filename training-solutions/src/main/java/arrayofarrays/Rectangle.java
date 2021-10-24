package arrayofarrays;

import java.util.Arrays;

public class Rectangle {
    int[][] rectangularMatrix(int size){
        int[][] output = new int[size][size];

        for (int i = 0; i < size; i++){
            Arrays.fill(output[i], i);  // Idea javasolta
//            for (int j = 0; j < output[i].length; j++){
//                output[i][j] = i;
//            }
        }
        return output;
    }

    public static void main(String[] args) {
        int size = 5;
        Rectangle rectangle = new Rectangle();
        int[][] matrix = rectangle.rectangularMatrix(size);

        for (int[] array : matrix){
            for (int element : array){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

}
