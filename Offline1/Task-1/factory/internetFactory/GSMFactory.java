package factory.internetFactory;

import component.internetConnection.GSM;
import component.internetConnection.Internet;

public class GSMFactory implements internetFactory {
    public Internet createInternet() {
        return new GSM();
    }   
    
}
