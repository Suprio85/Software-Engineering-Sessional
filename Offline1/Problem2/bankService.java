package Problem2;
import Problem2.Account.savingsAccount;
import Problem2.Customer.*;
import Problem2.Loan.Loan;

public class bankService {
    Customer customer;

    public bankService(Customer customer) {
        this.customer = customer;
    }

    public void calculateInterest(double amount, int time) {
        savingsAccount account = customer.createAccount();
        Loan loan = customer.createLoan();
        System.out.println("Account Interest: " + account.calculateInterest(amount, time));
        System.out.println("Loan Interest: " + loan.calculateInterest(amount, time));
    }



    
}
