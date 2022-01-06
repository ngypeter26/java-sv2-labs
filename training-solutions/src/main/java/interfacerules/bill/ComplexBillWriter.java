package interfacerules.bill;

import java.util.List;

public class ComplexBillWriter implements BillWriter{
    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sB = new StringBuilder();

        for (String lines : billItems){
            String[] lineArray = lines.split(";");
            int sum = Integer.parseInt(lineArray[2]) * Integer.parseInt(lineArray[1]);
            sB.append(lineArray[0]);
            sB.append("; darabszám: ");
            sB.append(lineArray[2]);
            sB.append(", egységár: ");
            sB.append(lineArray[1]);
            sB.append(", összesen: ");
            sB.append(sum);
            sB.append(" Ft\n");
        }
        return sB.toString();
    }

}
