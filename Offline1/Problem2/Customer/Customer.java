package Problem2.Customer;

import Problem2.Account.savingsAccount;
import Problem2.Loan.Loan;

public interface Customer{
    savingsAccount createAccount();
    Loan createLoan();
}
