package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;

        boolean b = "Hello John Doe".equals(message);
        boolean c = "Hello John Doe444".equals(message);

        System.out.println(prefix);
        System.out.println(name);
        System.out.println(message);
        System.out.println(b);
        System.out.println(c);

        message += 444;
        b = "Hello John Doe".equals(message);
        c = "Hello John Doe444".equals(message);

        System.out.println(message);
        System.out.println(b);
        System.out.println(c);

        String emptyString = ""+"";
        System.out.println(emptyString);
        System.out.println("emptyhossza:" + emptyString.length());

        String abc = "Abcde";
        System.out.println("abc hossza:" + abc.length());
        System.out.println(abc.substring(1,2) + abc.substring(3,4));
        System.out.println(abc.substring(1,3));

    }
}
