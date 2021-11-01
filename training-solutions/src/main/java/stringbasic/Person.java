package stringbasic;

public class Person {
    private String name;
    private String email;
    private String TAJ;
    private String bankAccount;
    private String telephone;

    public Person(String name, String email, String TAJ, String bankAccount, String telephone) {
        this.name = name;
        this.email = email;
        this.TAJ = TAJ;
        this.bankAccount = bankAccount;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTAJ() {
        return TAJ;
    }

    public void setTAJ(String TAJ) {
        this.TAJ = TAJ;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
