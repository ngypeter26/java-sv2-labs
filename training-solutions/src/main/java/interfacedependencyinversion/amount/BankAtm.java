package interfacedependencyinversion.amount;

public class BankAtm implements Payable{
    @Override
    public int getPayableAmount(int amount) {
        return (int) Math.ceil(amount/5.0)*5;
    }
}
