package factory;
import packageProduct.Package;
import packageProduct.advancePackage;

public class AdvancedPackageFactory implements packageFactory {
    
    @Override
    public Package createPackage() {
        return new advancePackage();
    }
    
}
