package abstractclass.demo;

public abstract class Bird extends Animal{
    private int eggs;

    public void layEggs(int numberOfEggs) {
        eggs = numberOfEggs;
    }
    //mivel itt sincs kész a move, ezért ez is absztarkt
}
