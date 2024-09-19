package factory.internetFactory;

import component.internetConnection.Ethernet;
import component.internetConnection.Internet;

public class ethernetFactory implements internetFactory {
    public Internet createInternet() {
        return new Ethernet();
    }
    
}
