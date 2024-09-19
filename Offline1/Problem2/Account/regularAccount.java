package Problem2.Account;

public class regularAccount extends Account {

    public regularAccount() {
        this.interestRate = 0.025;
    }


    @Override
    public double calculateInterest(double amount, int time) {
        return amount * interestRate * time;
    }
    
}
