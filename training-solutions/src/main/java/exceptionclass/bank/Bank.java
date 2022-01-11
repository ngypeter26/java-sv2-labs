package exceptionclass.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accountList;

    public Bank(List<Account> accountList) {
        isAccountListValid(accountList);
        this.accountList = accountList;
    }


    private void isAccountListValid(List<Account> accountList){
        if (accountList ==null){
            throw new IllegalArgumentException("Account list should not be null!");
        }
    }

    public void payment(String accountNumber, double amount){
        Account account = findAccount(accountNumber);
        account.subtract(amount);
    }
    public void deposit(String accountNumber, double amount){
        Account account = findAccount(accountNumber);
        account.deposit(amount);
    }

    private Account findAccount(String accountNumber){
        for (Account account : accountList){
            if (account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        throw new InvalidAccountNumberBankOperationException("Invalid account number!");
    }
}
