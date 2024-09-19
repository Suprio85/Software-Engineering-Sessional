package component.internetConnection;

public class Wifi implements Internet {

    @Override
    public String connect() {
        // System.out.println("Wifi Internet Connection added to the system.");
        return "Wifi Internet Connection added to the system.";
    }
}
