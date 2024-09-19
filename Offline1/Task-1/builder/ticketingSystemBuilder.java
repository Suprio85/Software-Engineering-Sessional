package builder;

import component.Display.Display;
import component.Microcontroller.Microcontroller;
import component.Payment.Payment;
import component.WebServer.webServer;
import component.internetConnection.Internet;
import ticketingSystem.ticketingSystem;

public class ticketingSystemBuilder implements ibuilder {

    private ticketingSystem system;

    public ticketingSystemBuilder(){
        system = new ticketingSystem();
    }

    @Override
    public void addDisplay(Display display) {
        system.setDisplay(display);
    }

    @Override
    public void addMicrocontroller(Microcontroller microcontroller) {
        system.setMicrocontroller(microcontroller);
    }
    @Override
    public void addWebServer(webServer webserver){
        system.setWebServer(webserver);
    }
    @Override
    public void build(){

        system.install();
    }
    @Override
    public void addPayment (Payment payment){
        system.setPayment(payment);
    }
    @Override
    public void addInternet(Internet internet){
        system.setInternet(internet);
    }
    
    @Override
    public ticketingSystem getSystem(){
       return this.system;
    }
    
    
}
