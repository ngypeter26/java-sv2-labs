package controliteration;

public class ControliterationMain {

    public void printNumberWhile() {
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }
    }

    public void printNumberDoWhile() {
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    }

    public void printNumberFor() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public void printNumberForEach() {
        String[] numbers = {"one", "two", "three"};
        for (String number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        ControliterationMain controliterationMain = new ControliterationMain();

        controliterationMain.printNumberDoWhile();
        controliterationMain.printNumberWhile();
        controliterationMain.printNumberForEach();
        controliterationMain.printNumberFor();
    }
}
