package introexceptionfirstexception;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Message {
    public void decode(List<String>  message){
        for (String i : message){
            //System.out.print(i);
            System.out.print((char) Integer.parseInt(i));
        }
    }

    public static void main(String[] args) {
        Message message = new Message();

        List<String> codedMessage = Arrays.asList("76", "101", "103", "121", "101", "110", "32", "115", "122", "233", "112", "32", "110", "97", "112", "111", "100", "33");
        message.decode(codedMessage);

        List<String> anotherCodedMessage = Arrays.asList("69", "122", "32", "101", "103", "121", "32", "104", "105", "98", "225", "115", "32", "252", "122", "101", "110", "101", "116", "46");
        message.decode(anotherCodedMessage);
        // O volt a 0 helyett
    }
}
