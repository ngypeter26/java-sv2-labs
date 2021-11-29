package methodstructure.pendrives;

public class Pendrive {
    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n Capacity: " + capacity + "\n Price: " + price;
    }

    public void risePrice(int percent){
        price = price * (100 + percent) / 100;
    }
    public int comparePricePerCapacity(Pendrive other){
        double ratioActual = ((double) price )/( (double) capacity);
        double ratioOther = ((double) other.getPrice() )/( (double) other.getCapacity());
        int answer;
        if (ratioActual - ratioOther > 0.00000000001){
            return 1;
        }else if (ratioActual - ratioOther < -0.00000000001){
            return -1;
        }else{
            return 0;
        }
    }
    public boolean isCheaperThan(Pendrive other){
        return price < other.getPrice();
    }
}
