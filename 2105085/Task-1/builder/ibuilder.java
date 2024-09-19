package builder;

import component.Display.Display;
import component.Microcontroller.Microcontroller;
import component.Payment.Payment;
import component.WebServer.webServer;
import component.internetConnection.Internet;
import ticketingSystem.ticketingSystem;

public interface ibuilder {
    void addMicrocontroller(Microcontroller   microcontroller);
    void addDisplay(Display display);
    void addWebServer( webServer  webserver);
    void addPayment(Payment payment);
    void addInternet(Internet internet);
    void build(); 
    ticketingSystem getSystem();
}
