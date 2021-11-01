package numbers;

import java.util.Scanner;

public class Percent {
    double getValue(int a, int b){
        return (double) a * b / 100;
    }

    double getBase(int a, int b){
        return (double) a / b * 100;
    }
    double getPercent(int a, int b){
        return (double) b / a * 100;
    }

    public static void main(String[] args) {
        Percent percent = new Percent();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a getvalue 1. számát! (200)");
        int a = scanner.nextInt();
        System.out.println("Add meg a getvalue 2. számát! (30)");
        int b = scanner.nextInt();
        System.out.println("getvalue eredménye:  " + percent.getValue(a,b));

        System.out.println("Add meg a getBase 1. számát! (60)");
        int c  = scanner.nextInt();
        System.out.println("Add meg a getBase 2. számát! (30)");
        b= scanner.nextInt();
        System.out.println("getBase eredménye:  " + percent.getBase(c,b));

        System.out.println("Add meg a getPercent 1. számát! (200)");
        a = scanner.nextInt();
        System.out.println("Add meg a getPercent 2. számát! (60)");
        c = scanner.nextInt();
        System.out.println("getPercent eredménye:  " + percent.getPercent(a,c));


    }
}


