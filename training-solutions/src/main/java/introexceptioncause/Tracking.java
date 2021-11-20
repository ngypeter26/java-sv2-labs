package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Tracking {
    public static void main(String[] args) {
        String fileName = "src/main/resources/introexceptioncause/tracking.csv";

        List<String> fileContent = new Tracking().readFile(fileName);

        List<Double> xCoordinates = new Tracking().getX(fileContent);
        List<Double> yCoordinates = new Tracking().getY(fileContent);
        List<Integer> hCoordinates = new Tracking().getH(fileContent);

        System.out.println(xCoordinates);
        System.out.println(yCoordinates);
        System.out.println(hCoordinates);

        System.out.println("A magasságok:");
        new Tracking().calculateLevels(hCoordinates);
        System.out.println();

        System.out.println("A távolságok:");
        double sumDistance = new Tracking().calculateDistances(xCoordinates,yCoordinates);
        System.out.println();
        System.out.println("A teljes távolság: " + sumDistance + "m");


    }

    public List<String>readFile(String fileName){
        try{
            return Files.readAllLines(Paths.get(fileName));
        }catch(IOException ioe){
            throw new IllegalStateException("Can not read file",ioe);
        }
    }
    public List<Double> getX(List<String> fileContent){
        List<Double> xCoordinates = new ArrayList<>();
        int index;
        for (String i : fileContent){
            index = i.indexOf(";");
            xCoordinates.add(Double.parseDouble(i.substring(0,index)));
        }
        return xCoordinates;
    }
    public List<Double> getY(List<String> fileContent){
        List<Double> yCoordinates = new ArrayList<>();
        int index1;
        int index2;
        for (String i : fileContent){
            index1 = i.indexOf(";");
            index2 = i.indexOf(";",index1+1);
            yCoordinates.add(Double.parseDouble(i.substring(index1+1,index2)));
        }
        return yCoordinates;
    }
    public List<Integer> getH(List<String> fileContent){
        List<Integer> hCoordinates = new ArrayList<>();
        int index1;
        int index2;
        for (String i : fileContent){
            index1 = i.indexOf(";");
            index2 = i.indexOf(";",index1+1);
            hCoordinates.add(Integer.parseInt(i.substring(index2+1)));
        }
        return hCoordinates;
    }

    public int calculateLevels(List<Integer> heights){
        int sumH = 0;
        int dh;
        for(int i = 1; i < heights.size(); i++){
            dh = heights.get(i)-heights.get(i-1);
            System.out.println(dh);
            sumH += dh;
        }
        return sumH;
    }

    public double calculateDistances(List<Double> xCoordinates, List<Double> yCoordinates){
        double sumDistance = 0;
        double fi1;
        double fi2;
        double lam1;
        double lam2;
        double dfi;
        double dlam;
        double R = 6371000;
        double a;
        double c;
        double actualDistance;
        for(int i = 1; i < xCoordinates.size(); i++){
            fi1 =  Math.toRadians(xCoordinates.get(i-1));
            fi2 =  Math.toRadians(xCoordinates.get(i));
            lam1 =  Math.toRadians(yCoordinates.get(i-1));
            lam2 =  Math.toRadians(yCoordinates.get(i));
            dfi = fi2 - fi1;
            dlam = lam2-lam1;
            a = Math.sin(dfi/2) * Math.sin(dfi/2) +
                    Math.cos(fi1) * Math.cos(fi2) * Math.sin(dlam/2) * Math.sin(dlam/2);
            c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
            actualDistance = R * c;
            System.out.println(actualDistance);
            sumDistance += actualDistance;
        }
        return sumDistance;
    }

}
