package initializer;

import initializer.trainer.Course;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private long balance;
    private Currency currency;


    static final List<Rate> RATES;

    static{
        List<Rate> rates = new ArrayList<>();
        rates.add(new Rate(Currency.HUF,1));
        rates.add(new Rate(Currency.EUR, 308.23));
        rates.add(new Rate(Currency.CHF, 289.24));
        rates.add(new Rate(Currency.GBP, 362.23));
        rates.add(new Rate(Currency.USD, 289.77));

        RATES = rates;
    }

    public CreditCard(long balance, Currency currency){
        this.balance = balance;
        this.currency = currency;
    }
    public CreditCard(long balance){
        this.balance = balance;
        this.currency = Currency.HUF;
    }

    public long getBalance(){
        return balance;
    }
    public boolean payment(long amount, Currency currency){
        double amountInHuf = ((double) amount * getConversionRate(currency));

        if (amountInHuf>balance){
            return false;
        }
            balance-=amountInHuf;
            return true;
    }
    public boolean payment(long amount){
        if (amount>balance){
            return false;
        }
        balance -=amount;
        return true;
    }

    private double getConversionRate(Currency currency) {
        for (Rate rate : RATES) {
            if (rate.getCurrency() == currency) {
                return rate.getConversionFactor();
            }
        }
        return 1.0;
    }
}
