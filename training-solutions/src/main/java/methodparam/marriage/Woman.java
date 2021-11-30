package methodparam.marriage;


import java.util.ArrayList;
import java.util.List;

public class Woman {
    private String name;
    private List<RegisterDate> registerDates = new ArrayList<>();

    public Woman(String name, List<RegisterDate> registerDates ) {
        this.name = name;
        this.registerDates = registerDates;
    }

    public String getName() {
        return name;
    }

    public List<RegisterDate> getRegisterDates() {
        return registerDates;
    }

    public void addRegisterDate(RegisterDate registerDate) {
        registerDates.add(registerDate);
    }

    public void setName(String name) {
        this.name = name;
    }
}
