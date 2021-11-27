package algorithmsdecision;

public class Prime {
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        int i = 2;
        boolean isPrime = true;
        while (i < number && isPrime) {
            if (number % i == 0) {
                isPrime = false;
            }
            i++;
        }
        return isPrime;
    }


    public int numberOfDividers(int number) {
        int numberOfDividers = 0;
        for (int i = 1; i < number + 1; i++) {
            if (number % i == 0) {
                numberOfDividers++;
            }
        }
        return numberOfDividers;
    }
}
