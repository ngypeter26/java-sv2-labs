package introexceptiontrace.aquarium;

public class AquariumMain {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        Fish fish1 = new Fish("Salmon","grey");
        Fish fish2 = new Fish("Goldfish","gold");
        Fish fish3 = new Fish("carp","blue");
        Fish fish4 = new Fish("catfish","grey");

        aquarium.addFish(fish1);
        aquarium.addFish(fish2);
        aquarium.addFish(fish3);
        aquarium.addFish(fish4);
    }


}
