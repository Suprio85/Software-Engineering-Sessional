package Problem2.Account;
import Problem2.Operation;


public abstract class savingsAccount implements Operation {
    double interestRate;

    public abstract double calculateInterest(double amount, int years);

    
}
