package Decorator;

import Items.Combo;
import Items.menuItem;
import java.util.List;



public abstract class Decorator extends Combo {
    protected Combo combo;

    public Decorator(Combo combo) {
        super(combo.getName());
        this.combo = combo;
    }

    @Override
    public String getName() {
        System.out.println("Decorator"+ combo.getName());
        return combo.getName();
    }

    @Override
    public double getPrice() {
        return combo.getPrice();
    }

    @Override
    public String getDescription() {
        return combo.getDescription();
    }
    @Override
    public void addItem(menuItem item) {
        combo.addItem(item);
    }
    @Override
    public menuItem removeItem(menuItem item) {
       return combo.removeItem(item);
    }

    @Override
    public String showItems() {
        return combo.showItems();
    }
    @Override
    public String showPrice() {
        return combo.showPrice();
    }
    @Override
    public String showDetails() {
        return combo.showDetails();
    }
    @Override
    public List<menuItem> getItems() {
        return combo.getItems();
    }
    @Override
    public menuItem getItem(String name) {
        return combo.getItem(name);
    }


    
}
