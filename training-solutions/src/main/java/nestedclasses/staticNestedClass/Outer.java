package nestedclasses.staticNestedClass;

public class Outer {
    public String saySomething() {
        Inner inner = new Inner();
        return inner.sayHello();
    }

    public static class Inner {
        public String sayHello() {
            return "Hello";
        }
    }
}
