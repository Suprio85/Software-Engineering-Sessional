package Items;

public class singleItem implements menuItem {
    String name;
    double price;

    public singleItem(String name) {
        this.name = name;
    }

    public singleItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
       return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return this.name;
    }

    
}
