package factory;
import packageProduct.Package; 
import packageProduct.premiumPackage;

public class PremiumPackageFactory implements packageFactory {
    
    @Override
    public Package createPackage() {
        return new premiumPackage();
    }
    
}
