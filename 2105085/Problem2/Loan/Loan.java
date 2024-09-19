package Problem2.Loan;

import Problem2.interestCalculator;

public abstract class Loan implements interestCalculator {
    double interestRate;

    public abstract double calculateInterest(double amount, int years);

}
