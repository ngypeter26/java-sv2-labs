package abstractclass.demo;

public abstract  class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public abstract void move();
    // mivel ez nincs kész, ezért az osztály absztarkt lesz
}
