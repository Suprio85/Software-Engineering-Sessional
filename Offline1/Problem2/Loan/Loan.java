package Problem2.Loan;

import Problem2.Operation;

public abstract class Loan implements Operation {
    double interestRate;

    public abstract double calculateInterest(double amount, int years);

}
