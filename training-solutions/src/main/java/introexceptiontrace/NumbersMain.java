package introexceptiontrace;
import java.util.Arrays;
import java.util.List;
public class NumbersMain {
    public static void main(String[] args) {
        Change change = new Change();
        System.out.println(Arrays.toString(change.changeNumbers()));
    }
}
