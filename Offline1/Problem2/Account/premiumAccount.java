package Problem2.Account;

public class premiumAccount extends Account {

    public premiumAccount() {
        this.interestRate = 0.05;
    }

    @Override
    public double calculateInterest(double amount, int time) {
        return amount * interestRate * time;
    }
    
}
