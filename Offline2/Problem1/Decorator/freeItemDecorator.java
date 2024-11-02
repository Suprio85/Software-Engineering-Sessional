package Decorator;
import Items.Combo;
import Items.freeItem;
import Items.menuItem;


public class freeItemDecorator extends Decorator {

    private freeItem item;

    public freeItemDecorator(Combo combo) {
        super(combo);
    }

    @Override
    public void addItem(menuItem item){
        this.item = new freeItem(item.getName());
        super.addItem(this.item);
    }
}
