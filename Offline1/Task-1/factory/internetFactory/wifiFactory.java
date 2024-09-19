package factory.internetFactory;

import component.internetConnection.Internet;
import component.internetConnection.Wifi;

public class wifiFactory implements internetFactory {
    public Internet createInternet() {
        return new Wifi();
    }
    
}
