package algorithmssum.sales;

import java.util.List;

public class SalesAmountSumCalculator {

    public int sumSalesAmount(List<Salesperson> salesList){
        int sumAmount = 0;
        for (Salesperson person : salesList){
            sumAmount += person.getAmount();
        }
        return sumAmount;
    }
}
