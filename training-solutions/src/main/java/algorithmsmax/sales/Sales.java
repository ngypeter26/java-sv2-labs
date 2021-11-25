package algorithmsmax.sales;

import java.util.List;

public class Sales {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales) {
        Salesperson absolutBestSalesPerson = sales.get(0);
        for (Salesperson sp : sales) {
            if (sp.getAmount() > absolutBestSalesPerson.getAmount()) {
                absolutBestSalesPerson = sp;
            }
        }
        return absolutBestSalesPerson;
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales) {
        Salesperson relativeBestSalesPerson = sales.get(0);
        for (Salesperson sp : sales) {
            if (sp.getDifferenceFromTarget() > relativeBestSalesPerson.getDifferenceFromTarget()) {
                relativeBestSalesPerson = sp;
            }
        }
        return relativeBestSalesPerson;
    }

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales) {
        Salesperson relativeWorstSalesPerson = sales.get(0);
        for (Salesperson sp : sales) {
            if (sp.getDifferenceFromTarget() < relativeWorstSalesPerson.getDifferenceFromTarget()) {
                relativeWorstSalesPerson = sp;
            }
        }
        return relativeWorstSalesPerson;
    }
//      hivatalos megoldás
//    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales) {
//        Salesperson salespersonWithFurthestBelowTarget = null;
//        for (Salesperson salesperson : sales) {
//            if (salespersonWithFurthestBelowTarget == null
//                    || (salesperson.getDifferenceFromTarget() < 0 && salesperson.getDifferenceFromTarget() < salespersonWithFurthestBelowTarget.getDifferenceFromTarget())) {
//                salespersonWithFurthestBelowTarget = salesperson;
//            }
//        }
//        return salespersonWithFurthestBelowTarget;
//    }
}
