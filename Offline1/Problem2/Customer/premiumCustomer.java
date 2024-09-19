package Problem2.Customer;

import Problem2.Account.savingsAccount;
import Problem2.Account.premiumAccount;
import Problem2.Loan.Loan;
import Problem2.Loan.PremiumLoan;

public class premiumCustomer implements Customer {
    @Override
    public Loan createLoan() {
        return new PremiumLoan();
    
    }

    @Override
    public savingsAccount createAccount() {
        return new premiumAccount();
    }

}
