package factory;

import component.Microcontroller.Arduino;
import component.Microcontroller.Microcontroller;

public class ArduinoFactory implements MicrocontrollerFactory{
    @Override
    public Microcontroller createMicrocontroller() {
        return new Arduino();
    }
    
}
