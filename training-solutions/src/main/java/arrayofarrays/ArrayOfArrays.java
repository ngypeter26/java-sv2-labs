package arrayofarrays;

public class ArrayOfArrays {
    public void printArrayOfArrays(int[][] a) {
        for (int[] aa : a) {
            for (int aaa : aa) {
                System.out.print(aaa + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 4;

        int[][] arrayOfArrays = new int[a][b];

        System.out.println(arrayOfArrays.length);
        System.out.println(arrayOfArrays[1].length);

        for (int i = 0; i < arrayOfArrays.length; i++) {
            for (int j = 0; j < arrayOfArrays[i].length; j++) {
                arrayOfArrays[i][j] = j;
            }
        }

        ArrayOfArrays printer = new ArrayOfArrays();
        printer.printArrayOfArrays(arrayOfArrays);
    }
}
