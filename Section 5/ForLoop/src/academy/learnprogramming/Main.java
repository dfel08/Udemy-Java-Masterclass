package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("!0,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
    }

    public static double calculateInterest (double amount, double interestRate) {
        return(amount * (interestRate/100));
    }
}
