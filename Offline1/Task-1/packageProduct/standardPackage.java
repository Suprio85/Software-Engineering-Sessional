package packageProduct;
import component.Display.*;
import component.Microcontroller.*;

public class standardPackage extends Package {
    @Override
    public Microcontroller getMicrocontroller() {
        return new Arduino();
    }

    @Override
    public Display getDisplay() {
        return new LED();
    }
    
}
