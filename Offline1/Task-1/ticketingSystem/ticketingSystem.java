package ticketingSystem;

import component.Display.Display;
import component.Microcontroller.Microcontroller;
import component.Payment.Payment;
import component.WebServer.webServer;
import component.internetConnection.Internet;

public class ticketingSystem {
    Microcontroller microcontroller;
    Display display;
    Internet internet;
    webServer   webserver;
    Payment payment;


    public void setMicrocontroller(Microcontroller microcontroller) {
        this.microcontroller = microcontroller;
    }

    public void setDisplay(Display display2) {
        this.display = display2;
    }

    public void setInternet(Internet internet) {
        this.internet = internet;
    }

    public void setWebServer(webServer webserver) {
        this.webserver = webserver;
    }

    public void setPayment(Payment payment){
        this.payment = payment;

    }

    @Override 
    public  String toString(){
       return microcontroller.create() + "\n" + display.create() + "\n" + internet.connect() + "\n" + webserver.create() + "\n" + payment.pay();
    }

   
}
