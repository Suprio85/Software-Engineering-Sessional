package Problem2.Account;
import Problem2.interestCalculator;


public abstract class Account implements interestCalculator {
    double interestRate;

    public abstract double calculateInterest(double amount, int years);

    
}
