package methodparam.sums;

public class Result {
    private double sumPlus;
    private double sumMinus;

    public Result(double sumPlus, double sumMinus) {
        this.sumPlus = sumPlus;
        this.sumMinus = sumMinus;
    }

    public double getSumPlus() {
        return sumPlus;
    }

    public double getSumMinus() {
        return sumMinus;
    }
}
