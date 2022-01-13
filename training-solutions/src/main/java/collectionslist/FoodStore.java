package collectionslist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

public class FoodStore {
    LinkedList<Food> foods = new LinkedList<>();

    public void addFood(Food food){
        if (!sellFirst(food)) {
            foods.add(food);
        }
    }

    public boolean sellFirst(Food food){
        System.out.println(food.getExpirationDate().equals( LocalDate.now()));
        if (food.getExpirationDate().equals( LocalDate.now())) {
            foods.addFirst(food);
            return true;
        }
        return false;
    }

    public LinkedList<Food> getFoods() {
        return foods;
    }
}
