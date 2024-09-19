package factory;
import component.Microcontroller.*;

public class ATMega32Factory implements MicrocontrollerFactory{
    @Override
    public Microcontroller createMicrocontroller() {
        return new ATMega32();
    }
}