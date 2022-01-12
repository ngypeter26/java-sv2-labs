package nestedclasses.memberInnerClass;

public class Outer {
    public class Inner {
        public String sayHello() {
            return "Hello";
        }
    }

    public String saySomething() {
        return new Inner().sayHello();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();


    }
}
