package array;

public class ArrayHandler {
    public void addIndexToNumber(int[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] += i;
//            System.out.println(source[i]);
        }
    }

    public void concatenateIndexToWord(String[] source) {
        for (int i = 0; i < source.length; i++) {
          //  source[i] = Integer.toString(i) + source[i];
            source[i] = i + source[i];
//            System.out.println(source[i]);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 9};
        String[] strings = {"apple", "beer", "jah", "ize"};

//        for (int number : numbers) {
//            System.out.println(number);
//        }

        ArrayHandler arrayHandler = new ArrayHandler();

        arrayHandler.addIndexToNumber(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }
        for (int number : numbers) {
            System.out.print(number);
            System.out.print(", ");
        }

        arrayHandler.concatenateIndexToWord(strings);
        System.out.println();
        for (String string : strings) {
            System.out.println(string);
        }
        for (String string : strings) {
            System.out.print(string);
            System.out.print(", ");
        }
    }


}
