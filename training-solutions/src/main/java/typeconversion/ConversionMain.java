package typeconversion;

import java.util.Arrays;

public class ConversionMain {
    public static void main(String[] args) {
        Conversion conversion = new Conversion();
        System.out.println( conversion.convertDoubleToDouble(1.2));

        int[] input = { 5, -14, 6, 2, 125, 354, 9738, 3};
        byte[] output = conversion.convertIntArrayToByteArray(input);

        System.out.println(Arrays.toString(output));

        System.out.println(conversion.getFirstDecimal(1.34));

    }





}
