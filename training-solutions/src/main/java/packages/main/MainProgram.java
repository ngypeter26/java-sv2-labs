package packages.main;

//import packages.greetings.Greeter;   //importálás

public class MainProgram {
    public static void main(String[] args) {
//        Greeter greeter = new Greeter();

        packages.greetings.Greeter greeter = new packages.greetings.Greeter();  // minősített név

        greeter.sayHello();
    }
}
