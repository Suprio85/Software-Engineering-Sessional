package packageProduct;

import component.Display.Display;
import component.Display.LCD;
import component.Microcontroller.ATMega32;
import component.Microcontroller.Microcontroller;

public class basicPackage extends Package {
    

    @Override
    public Microcontroller getMicrocontroller() {
        microcontroller = new ATMega32();
        return microcontroller;
    }

    @Override
    public Display getDisplay() {
        display = new LCD();
        return display;
    }

    
}
