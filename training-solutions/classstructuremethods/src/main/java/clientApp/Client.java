package clientApp;

public class Client {
    private String name;
    private int year;
    private String address;

    public String getName() {
        return name;
    }
    public void changeName(String name){
        this.name = name;
    }

    public int getYear() {
        return year;
    }
    public void changeYear(int year){
        this.year = year;
    }

   // public String getAddress(String address) {
   public String getAddress() {
        return address;
    }



    public void changeAddress(String address){
        this.address = address;
    }

    public void migrate(String newAddress){
        address = newAddress;  // miért nem this.address?
    }

}
