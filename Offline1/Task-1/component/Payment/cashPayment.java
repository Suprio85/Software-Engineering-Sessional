package component.Payment;

public class cashPayment implements Payment {

    @Override
    public String pay() {
        // System.out.println("Cash Payment added to the system.");
        return "Cash Payment added to the system.";
    }
    
}
