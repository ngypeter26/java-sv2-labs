package statements;

public class Investment {
    private double cost;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        cost = 0.3;
        active = true;
    }

    public int getFund() {
        return fund;
    }

    public double getYields(int days){
        return fund * days/365 * interestRate / 100;
    }

    public double close(int days){
        boolean activeOld = active;
        active = false;
        double amount = (getFund() + getYields( days )) * (1-cost/100);
        return activeOld ? amount : 0;
    }
}
