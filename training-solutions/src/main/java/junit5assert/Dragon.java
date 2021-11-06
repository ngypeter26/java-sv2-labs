package junit5assert;

public class Dragon {
    String name; int numberOfHeads; double height;


    public Dragon(String name, int numberOfHeads, double height) {
        this.name = name;
        this.numberOfHeads = numberOfHeads;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfHeads() {
        return numberOfHeads;
    }

    public void setNumberOfHeads(int numberOfHeads) {
        this.numberOfHeads = numberOfHeads;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
