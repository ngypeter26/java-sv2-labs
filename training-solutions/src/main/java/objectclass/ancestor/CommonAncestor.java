package objectclass.ancestor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonAncestor {
    public static void main(String[] args) {

        List<Object> objectList = new ArrayList<>();

        Fruit fruit1 = new Fruit();
        objectList.add(fruit1);

        Apple apple1 = new Apple();
        objectList.add(apple1);

        Starking starking1 = new Starking();
        objectList.add(starking1);

        Vegetable vegetable1 = new Vegetable();
        objectList.add(vegetable1);

        objectList.add("alma");
        objectList.add(12);
        objectList.add('x');
        objectList.add("alma");

        LocalDate date = LocalDate.now();
        objectList.add(date);

        int[] array = {1,2,3,4,5,6};
        objectList.add(array);

        List<String> stringList = Arrays.asList("uzgfu","zvfzufgu","zhhfuzf","gvzuog","uzfgu");
        objectList.add(stringList);

        System.out.println(objectList);



    }
}
