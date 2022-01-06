package interfacerules.bill;

import java.util.List;

public class SimpleBillWriter implements BillWriter{

    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder sB = new StringBuilder();

        for (String lines : billItems){
            String[] lineArray = lines.split(";");
            int sum = Integer.parseInt(lineArray[2]) * Integer.parseInt(lineArray[1]);
            sB.append(lineArray[0]);
            sB.append(", ");
            sB.append(lineArray[2]);
            sB.append(" * ");
            sB.append(lineArray[1]);
            sB.append(" = ");
            sB.append(sum);
            sB.append(" Ft\n");
        }
        return sB.toString();
    }
}
