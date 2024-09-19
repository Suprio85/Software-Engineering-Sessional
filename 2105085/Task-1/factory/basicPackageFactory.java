package factory;
import packageProduct.Package;
import packageProduct.basicPackage;

public class basicPackageFactory implements packageFactory {
    
    @Override
    public Package createPackage() {
        return new basicPackage();
    }
    
}
