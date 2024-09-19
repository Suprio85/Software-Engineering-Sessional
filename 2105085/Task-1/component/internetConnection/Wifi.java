package component.internetConnection;

public class Wifi implements Internet {

    @Override
    public void connect() {
        System.out.println("Connecting to the internet using Wifi");
    }
}
