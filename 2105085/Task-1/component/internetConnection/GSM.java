package component.internetConnection;

public class GSM implements Internet {
    @Override
    public void connect() {
        System.out.println("Connected to GSM");
    }
}