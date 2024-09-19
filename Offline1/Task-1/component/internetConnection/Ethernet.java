package component.internetConnection;

public class Ethernet implements Internet {
    @Override
    public void connect() {
        System.out.println("Connected to Ethernet");
    }
    
}
