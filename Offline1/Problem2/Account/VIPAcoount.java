package Problem2.Account;

public class VIPAcoount extends savingsAccount {

    public VIPAcoount() {
        this.interestRate = 0.05;
    }

    @Override
    public double calculateInterest(double amount, int time) {
        return amount * interestRate * time;
    }
    
}
