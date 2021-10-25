package objects;

public class NumberOfObjects {
    public static void main(String[] args) {
        Book book1 = new Book();  // 1
        Book book2 = new Book();  // 2
        Book book3 = new Book();  // 3
        Book book4 = book1;// 3
        Book book5 = book1;// 3
        Book book6 = book3;// 3
        Book book7 = null;  // 4
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
        System.out.println(book5);
        System.out.println(book6);
        System.out.println(book7);
        book4 = book6; // 4
        new Book(); // 5
        System.out.println(new Book());
        book5 = new Book();  // 6
//        book6 = null;
//        book5 = book4;

        System.out.println("Összesen 6? ");
    }


}
