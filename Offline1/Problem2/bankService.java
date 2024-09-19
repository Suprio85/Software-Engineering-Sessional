package Problem2;
import Problem2.Account.savingsAccount;
import Problem2.Customer.*;
import Problem2.Loan.Loan;

public class bankService {
    Customer customer;
    double savingsAccountInterest;
    double loanInterest;

    public bankService(Customer customer) {
        this.customer = customer;
    }

    public void calculateInterest(double amount, int time) {
        savingsAccount account = customer.createAccount();
        Loan loan = customer.createLoan();
        savingsAccountInterest = account.calculateInterest(amount, time);
        loanInterest = loan.calculateInterest(amount, time);
    }

    public double getSavingsAccountInterest() {
        return savingsAccountInterest;
    }
    public double getLoanInterest() {
        return loanInterest;
    }

    @Override public String toString() {
        return "Savings Account Interest: " + savingsAccountInterest + "\nLoan Interest: " + loanInterest;
    }



    
}
