package director;

import builder.ibuilder;
import component.Payment.Payment;
import component.Payment.cashPayment;
import component.WebServer.webServer;
import component.internetConnection.Internet;
import packageProduct.Package;

public class Director {
    ibuilder builder;
    Package packageProduct;
    Internet internet;
    webServer webserver;
    Payment payment;


    public Director(ibuilder builder, Package packageProduct, Internet internet, webServer webserver) {
        this.packageProduct = packageProduct;
        this.builder = builder;
        this.internet = internet;
        this.webserver = webserver;
        payment = new cashPayment();
    }

    public void construct() {
        builder.addMicrocontroller(packageProduct.getMicrocontroller());
        builder.addDisplay(packageProduct.getDisplay());
        builder.addPayment(payment);
        builder.addWebServer(webserver);
        builder.addInternet(internet);
        builder.build();
       
    }




    
    
}
