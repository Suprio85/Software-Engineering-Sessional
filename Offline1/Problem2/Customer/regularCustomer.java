package Problem2.Customer;

import Problem2.Account.savingsAccount;
import Problem2.Account.regularAccount;
import Problem2.Loan.Loan;
import Problem2.Loan.RegularLoan;

public class regularCustomer implements Customer {
    @Override
    public Loan createLoan() {
        return new RegularLoan();
    
    }

    @Override
    public savingsAccount createAccount() {
        return new regularAccount();
    }
}