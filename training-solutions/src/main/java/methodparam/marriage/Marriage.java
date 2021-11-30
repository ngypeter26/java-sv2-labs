package methodparam.marriage;

import java.time.LocalDate;

public class Marriage {

    public void getMarried(Woman woman, Man man){
        setWomanMarriedName(woman,  man.getName());
        addRegisterDate(woman,man);
    }

    private void setWomanMarriedName(Woman woman, String name) {
        String[] names = name.split(" ");
        String husbandLastName = names[0];
        woman.setName(husbandLastName + "-" + woman.getName());
    }
    private void addRegisterDate(Woman woman, Man man) {
        RegisterDate event = new RegisterDate("házasságkötés ideje", LocalDate.now());
        woman.addRegisterDate(event);
        man.addRegisterDate(event);
    }
}
