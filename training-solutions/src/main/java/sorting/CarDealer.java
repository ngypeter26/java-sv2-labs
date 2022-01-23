package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarDealer {
    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getCars() {
        return new ArrayList<>(cars);
    }
    public List<Car> getCarsOrderedByYearOfConstruction() {
        List<Car> sorted = cars;
        sorted.sort( new CarConstructionComparator());
        return cars;
    }

    public List<Car> getCarsOrderedByPrice() {
        List<Car> sorted = cars;
        Collections.sort(sorted, new CarPriceComparator());
        return cars;
    }


}
