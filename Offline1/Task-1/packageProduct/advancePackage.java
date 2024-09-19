package packageProduct;

import component.Display.*;
import component.Microcontroller.*;


public class advancePackage extends Package {
    @Override
    public Microcontroller getMicrocontroller() {
        microcontroller = new RaspberryPie();
        return microcontroller;
    }

    @Override
    public Display getDisplay() {
        display = new OLED();
        return display;
    }
    
}
