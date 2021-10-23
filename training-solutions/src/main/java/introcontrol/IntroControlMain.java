package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl control = new IntroControl();

        System.out.println("Test subtractTenIfGreaterThanTen 12: " + control.subtractTenIfGreaterThanTen(12));
        System.out.println("Test subtractTenIfGreaterThanTen 10: " + control.subtractTenIfGreaterThanTen(10));
        System.out.println("Test subtractTenIfGreaterThanTen 2: " + control.subtractTenIfGreaterThanTen(2));

        System.out.println("");
        System.out.println("Test describeNumber 0: " + control.describeNumber(0));
        System.out.println("Test describeNumber 3: " + control.describeNumber(3));

        System.out.println("");
        System.out.println("Test greetingToJoe Joe: " + control.greetingToJoe("Joe"));
        System.out.println("Test greetingToJoe Jack: " + control.greetingToJoe("Jack"));

        System.out.println("");
        System.out.println("Test calculateBonus 1200000: " + control.calculateBonus(1200000));
        System.out.println("Test calculateBonus 900000: " + control.calculateBonus(900000));

        System.out.println("");
        System.out.println("Test calculateConsumption 9800 5: " + control.calculateConsumption(9800, 5));
        System.out.println("Test calculateConsumption 5 9800: " + control.calculateConsumption(5, 9800));

        System.out.println("");
        System.out.print("Test printNumbers 5: "  );control.printNumbers(5);
        System.out.print("Test printNumbers 12: "  );control.printNumbers(12);

        System.out.println("");
        System.out.print("Test printNumbersBetween 5 - 12 "  );control.printNumbersBetween(5,12);
        System.out.print("Test printNumbersBetween 12 - 5 "  );control.printNumbersBetween(12,5);

        System.out.println("");
        System.out.print("Test printNumbersBetweenAnyDirection 5 - 12 "  );control.printNumbersBetweenAnyDirection(5,12);
        System.out.print("Test printNumbersBetweenAnyDirection 12 - 5 "  );control.printNumbersBetweenAnyDirection(12,5);

        System.out.println("");
        System.out.print("Test printOddNumbers 5: "  );control.printOddNumbers(5);
        System.out.print("Test printOddNumbers 12: "  );control.printOddNumbers(12);
    }
}
