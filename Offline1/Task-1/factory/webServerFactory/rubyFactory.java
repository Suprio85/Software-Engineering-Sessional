package factory.webServerFactory;

import component.WebServer.Ruby;
import component.WebServer.webServer;

public class rubyFactory implements webServerFactory {
    public webServer createWebServer() {
        return new Ruby();
    }
    
}
