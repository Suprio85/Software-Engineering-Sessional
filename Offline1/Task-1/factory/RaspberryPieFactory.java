package factory;

import component.Microcontroller.Microcontroller;
import component.Microcontroller.RaspberryPie;

public class RaspberryPieFactory implements MicrocontrollerFactory{
    @Override
    public Microcontroller createMicrocontroller() {
        return new RaspberryPie();
    }
    
}
