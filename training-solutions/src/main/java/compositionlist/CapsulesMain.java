package compositionlist;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CapsulesMain {
    public static void main(String[] args) {


        Capsules capsules = new Capsules();
        System.out.println(capsules.getColors());

        capsules.addFirst("black");
        capsules.addFirst("red");
        capsules.addLast("green");
        capsules.addLast("yellow");
        System.out.println(capsules.getColors());

        capsules.removeFirst();
        System.out.println(capsules.getColors());

        capsules.removeLast();
        System.out.println(capsules.getColors());
    }
}
