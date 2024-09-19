package packageProduct;

import component.Display.Display;
import component.Microcontroller.Microcontroller;

public abstract class Package {
    Microcontroller microcontroller;
    Display display;
    
    public abstract Microcontroller getMicrocontroller();

    public abstract Display getDisplay();

    
}
