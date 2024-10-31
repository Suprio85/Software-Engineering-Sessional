package Items;

public class freeItem implements menuItem {
    String name;

    public freeItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return 0;
    }
    @Override
    public String getDescription() {
        return this.name+"(Free!!)"+ "\n";
    }
    
}
