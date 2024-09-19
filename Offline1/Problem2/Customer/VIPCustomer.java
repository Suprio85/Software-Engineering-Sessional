package Problem2.Customer;

import Problem2.Account.savingsAccount;
import Problem2.Account.VIPAcoount;
import Problem2.Loan.Loan;
import Problem2.Loan.VIPLoan;

public class VIPCustomer implements Customer {
    @Override
    public Loan createLoan() {
        return new VIPLoan();
    
    }

    @Override
    public savingsAccount createAccount() {
        return new VIPAcoount();
    }

    
}
