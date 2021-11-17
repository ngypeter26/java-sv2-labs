package introexceptionthrow;

public class Validation {

    public void validateName(String name){
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Null or empty");
        }
    }

    public void validateAge(String ageString){
        if (ageString == null || ageString.isEmpty()){
            throw new IllegalArgumentException("Null or empty");
        }
//        megoldás
        char[] ageChar =ageString.toCharArray();
        for (char i : ageChar){
            if (!Character.isDigit(i)){
                throw new IllegalArgumentException("Not a number");
            }
        }
//        int age = -10;
//        try {
//            age = Integer.parseInt(ageString);
//        }
//        catch (IllegalArgumentException nfe){
//            throw new IllegalArgumentException("not a number");
//        }

        int age = Integer.parseInt(ageString);
        if (age<0 || age>120){
            throw new IllegalArgumentException("Must be between 0 and 120");
        }
    }

}
