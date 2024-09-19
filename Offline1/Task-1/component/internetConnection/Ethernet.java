package component.internetConnection;

public class Ethernet implements Internet {
    @Override
    public String connect() {
        // System.out.println("Ethernet Internet Connection added to the system.");
        return "Ethernet Internet Connection added to the system.";
    }
    
}
