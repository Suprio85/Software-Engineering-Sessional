package Problem2.Account;

public class VIPAcoount extends Account {

    public VIPAcoount() {
        this.interestRate = 0.05;
    }

    @Override
    public double calculateInterest(double amount, int time) {
        return amount * interestRate * time;
    }
    
}
