package interfacedependencyinversion.amount;

public class Cash implements Payable{
    @Override
    public int getPayableAmount(int amount) {
        //double mar = (double) amount/5.0;
        return (int) Math.round(amount/5.0)*5;
    }
}
