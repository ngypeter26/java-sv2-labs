package day02;

import java.util.ArrayList;
import java.util.List;

public class Prime {
    public boolean isPrime(int number){
        int numberOfDivider = 0;
        List<Integer> dividers = new ArrayList<>();
        for (int i=1;i<number+1;i++){
            if(number % i == 0){
                numberOfDivider++;
                dividers.add(i);
            }
        }
//        System.out.println(number + " osztói: " + dividers);
//        System.out.println(number + " osztóinak száma: " + numberOfDivider);
        System.out.println(number + ": " + (numberOfDivider ==2 ? " prime" : " not prime"));
        return numberOfDivider ==2 ? true : false;
    }

    public static void main(String[] args) {
        Prime prime = new Prime();

        prime.isPrime(1);
        prime.isPrime(2);
        prime.isPrime(3);
        prime.isPrime(4);
        prime.isPrime(12);
    }

}
