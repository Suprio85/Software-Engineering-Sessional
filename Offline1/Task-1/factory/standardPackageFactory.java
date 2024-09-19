package factory;
import packageProduct.Package;
import packageProduct.standardPackage;


public class standardPackageFactory implements packageFactory{
   
    @Override
    public Package createPackage() {
        return new standardPackage();
    }
}
