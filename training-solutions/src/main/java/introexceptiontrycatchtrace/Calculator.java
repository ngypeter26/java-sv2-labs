package introexceptiontrycatchtrace;

import java.util.InputMismatchException;

public class Calculator {

    public String Operation(int fisrtNumber, int secondNumber, String operation) {
        switch (operation) {
            case "+": {
                return Integer.toString(sum(fisrtNumber, secondNumber));
            }
            case "-": {
                return Integer.toString(subtract(fisrtNumber, secondNumber));
            }
            case "*": {
                return Integer.toString(multiplicate(fisrtNumber, secondNumber));
            }
            case "/": {
                try {
                    return Integer.toString(divide(fisrtNumber, secondNumber));
                }
                catch (ArithmeticException nfe) {
                    return "0-val való osztás nem értelmezett";
                }
            }
            default: {
                return "Ilyen művelet nincs!";
            }
        }
    }

        public int sum ( int fisrtNumber, int secondNumber){
            return fisrtNumber + secondNumber;
        }
        public int subtract ( int fisrtNumber, int secondNumber){
            return fisrtNumber - secondNumber;
        }
        public int multiplicate ( int fisrtNumber, int secondNumber){
            return fisrtNumber * secondNumber;
        }
        public int divide ( int fisrtNumber, int secondNumber){
            return fisrtNumber / secondNumber;
        }
}
