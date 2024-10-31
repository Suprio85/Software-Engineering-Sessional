package Problem2.Loan;

public class RegularLoan extends Loan {
    
        public RegularLoan() {
            this.interestRate = 0.14;
        }
    
        @Override
        public double calculateInterest(double amount, int years) {
            return amount * interestRate * years;
        }

}
