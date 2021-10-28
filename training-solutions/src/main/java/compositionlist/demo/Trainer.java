package compositionlist.demo;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private String name;
    //private List<Address> addresses;
    private List<Address> addresses= new ArrayList<>();//vagy itt is példányosíthatom

    public Trainer(String name) { // lehetne itt is megadni
        this.name = name;
    }

    public void addAddress(Address address){
        addresses.add(address);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
