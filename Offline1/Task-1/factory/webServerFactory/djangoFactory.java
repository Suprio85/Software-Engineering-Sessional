package factory.webServerFactory;

import component.WebServer.Django;
import component.WebServer.webServer;

public class djangoFactory implements webServerFactory {
    public webServer createWebServer() {
        return new Django();
    }
    
}
