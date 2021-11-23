package introexceptionwritefiletestjunit5;

import java.io.IOException;

public class NameValidator {
    public boolean isNameValid(String name){
//        if(name!=null && name.trim().indexOf(" ")>0){
        if(name!=null && name.trim().length()>0){
            return true;
        }else{
            throw new IllegalArgumentException("Name is invalid");
        }
    }
}
