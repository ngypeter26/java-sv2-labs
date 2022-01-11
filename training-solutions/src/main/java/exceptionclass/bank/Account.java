package exceptionclass.bank;

public class Account {
    private String accountNumber;
    private double balance;
    private double maxSubtract;

    public Account(String accountNumber, double balance) {
        isAccountNumberValid(accountNumber);
        this.accountNumber = accountNumber;
        this.balance = balance;
        maxSubtract = 100000;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }
    public double subtract(double amount){
        isAmountNegative(amount);
        if(amount > balance){
            throw new LowBalanceBankOperationException("Low balance!");
        }
        balance -= amount;
        return balance;
    }
    public double deposit(double amount){
        isAmountNegative(amount);
        balance += amount;
        return balance;
    }

    public void setMaxSubtract(double maxSubtract) {
        if(maxSubtract < 0){
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }
        this.maxSubtract = maxSubtract;
    }
    private void isAccountNumberValid(String accountNumber){
        if(accountNumber == null || accountNumber.isEmpty()){
            throw new IllegalArgumentException("Account number should not be null!");
        }
    }
    private void isAmountNegative(double amount){
        if(amount < 0){
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }
    }



}
