package dynamictypes;

import java.util.ArrayList;
import java.util.List;

public class Trainer extends Human {

    public Trainer(String name) {
        super(name);
    }

    @Override
    public String getDescription(){
        return "Trainer: " + getName();
    }

}
