package abstractclass.demo;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Duck();
        animal.move();          // Waddle
//        animal.layEggs(5);      // Fordítási hiba: Animalben nincs layEggs metódus
        Bird bird = new Duck();
        bird.move();            // Waddle
        bird.layEggs(5);        // OK
    }
}
