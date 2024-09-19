package Problem2.Loan;

public class PremiumLoan extends Loan {
    
        public PremiumLoan() {
            this.interestRate = 0.12;
        }
    
        @Override
        public double calculateInterest(double amount, int years) {
            return amount * interestRate * years;
        }
    
}
