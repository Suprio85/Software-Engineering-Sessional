package Problem2.Loan;

public class VIPLoan extends Loan {
    
        public VIPLoan() {
            this.interestRate = 0.10;
        }
    
        @Override
        public double calculateInterest(double amount, int years) {
            return amount * interestRate * years;
        }
}
