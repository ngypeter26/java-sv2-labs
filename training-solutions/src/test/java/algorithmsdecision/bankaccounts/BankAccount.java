package algorithmsdecision.bankaccounts;

public class BankAccount {
    private String nameOfOwner;
    private String accountNumber;
    private int balance;

    public void withdraw(int amount){
        balance -= amount;
    }

    public void deposit (int amount){
        balance += amount;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

}