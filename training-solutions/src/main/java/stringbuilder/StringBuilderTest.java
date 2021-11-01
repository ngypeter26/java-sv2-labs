package stringbuilder;



public class StringBuilderTest {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("John");
        StringBuilder sb = new StringBuilder(1000);
        sb.append(" Doe");

        for (int i = 0; i<3; i++){
        sb.append(" Doe");
        }

        String s = sb.toString();
        System.out.println(s);

        sb.insert(1,"xxx");  //beszúrja ide, nem új, hanem az eredeti sb-t módosította
        System.out.println(sb);

        sb.delete(1,3);
        System.out.println(sb.reverse());



    }
}
