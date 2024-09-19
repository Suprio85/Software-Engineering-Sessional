package factory.webServerFactory;

import component.WebServer.nodeJS;
import component.WebServer.webServer;


public class nodejsFactory implements webServerFactory {
    public webServer createWebServer() {
        return new nodeJS();
    
    }
    
}
