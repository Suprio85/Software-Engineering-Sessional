package Problem2.Customer;

import Problem2.Account.Account;
import Problem2.Loan.Loan;

public interface Customer{
    Account createAccount();
    Loan createLoan();
}
