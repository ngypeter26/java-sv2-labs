package chars;

public class LettersAndDigits {

    public void printLetterOrDigit(String text){
        for (char i : text.toCharArray()){
           if ( Character.isAlphabetic(i)){
               System.out.println(i + ":" + " betű");
            }
            else if ( Character.isDigit(i)){
                System.out.println(i + ":" + " szám");
            }
           else if ( Character.isWhitespace(i)){
               System.out.println(i + ":" + " white space");
           }
            else{
               System.out.println(i + ":" + " karakter ");
           }
        }
    }

    public static void main(String[] args) {
        LettersAndDigits  lettersAndDigits = new LettersAndDigits();
        lettersAndDigits.printLetterOrDigit(" bfa68fF;X ");
    }
}
