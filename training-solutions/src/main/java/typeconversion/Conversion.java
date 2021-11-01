package typeconversion;

import java.util.Arrays;

public class Conversion {

    public double convertDoubleToDouble(double number){
        int numberInt = (int) number;
        double numberDouble = (double) numberInt;
        return numberDouble;
    }
    public byte[] convertIntArrayToByteArray(int[] input){
        byte[] output = new byte[input.length];
        for (int i=0; i< input.length; i++){
            output[i] =  input[i] > 0 && input[i] <127 ? (byte) input[i] : -1;
        }
        return output;
    }

    public int getFirstDecimal(double number){
        int numberInt = (int) number;
        return (int) ((number-numberInt)*10);
    }

}
