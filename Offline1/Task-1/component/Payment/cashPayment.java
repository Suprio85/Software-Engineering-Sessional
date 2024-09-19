package component.Payment;

public class cashPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Cash payment done.");
    }
    
}
