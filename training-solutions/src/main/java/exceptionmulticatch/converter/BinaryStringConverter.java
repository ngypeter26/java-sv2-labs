package exceptionmulticatch.converter;

import java.util.Arrays;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String text){
//        boolean[] result = boolean[text.length()];
        char[] textChar = text.toCharArray();

        for(char c : textChar){
            if (c!='1' || c!='1'){}

        }
        return null;
    }

    public String booleanArrayToBinaryString(boolean[] input){
            return null;
    }

    private void isInputNull(boolean[] input){
        if (input ==null){
            throw new NullPointerException();
        }
    }
}
