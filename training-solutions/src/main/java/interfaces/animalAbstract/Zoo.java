package interfaces.animalAbstract;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }
    public int getNumberOfAnimals(){
        return animals.size();
    }
    public int getNumberOfAllLegs(){
        int numberOfAllLegs = 0;
        for (Animal animal : animals){
            numberOfAllLegs += animal.getNumberofLegs();
        }
        return numberOfAllLegs;
    }
}
