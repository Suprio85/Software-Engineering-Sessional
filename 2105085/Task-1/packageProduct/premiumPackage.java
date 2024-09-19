package packageProduct;

import component.Display.*;
import component.Microcontroller.*;

public class premiumPackage extends Package {
    @Override
    public Microcontroller getMicrocontroller() {
        microcontroller = new RaspberryPie();
        return microcontroller;
    }

    @Override
    public Display getDisplay() {
        display =new touchScreen();
        return display;
    }

    
}
