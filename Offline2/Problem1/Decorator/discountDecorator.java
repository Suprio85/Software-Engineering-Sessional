package Decorator;

import Items.Combo;
// import Items.menuItem;

public class discountDecorator extends Decorator{
double discount;
double discountedPrice;
    public discountDecorator(Combo combo, double discount) {
        super(combo);
        this.discount = discount;
        this.discountedPrice = super.getPrice()*(1-discount/100);
    }

  
    @Override
    public double getPrice() {
        return this.discountedPrice;
    }

    @Override
    public String showPrice(){
        return super.showPrice() +'\n' + "Discount: " + discount + "%" + '\n' + "Discounted Price: " + this.discountedPrice;
    }

    @Override
    public String showDetails(){
        return super.getName()+'\n'+super.showItems() + '\n' + this.showPrice();
    }
}
