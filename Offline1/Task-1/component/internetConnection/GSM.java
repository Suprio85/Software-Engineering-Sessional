package component.internetConnection;

public class GSM implements Internet {
    @Override
    public String connect() {
        // System.out.println("GSM Internet Connection added to the system.");
        return "GSM Internet Connection added to the system.";
    }
}