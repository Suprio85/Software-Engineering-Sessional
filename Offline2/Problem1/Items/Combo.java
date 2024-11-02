package Items;
import java.util.ArrayList;
import java.util.List;
public class Combo implements menuItem {
    String name;
    List<menuItem> items ;
    double totalPrice;
    double discount;
    double discountedPrice;
    
    public Combo(String name){

        this.name = name;
        this.items = new ArrayList<menuItem>();
        this.discount = 0;
        this.totalPrice = 0;
    }
   

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public double getPrice() {
        
        double total = 0;
        for(menuItem item : items){
            total += item.getPrice();
        }
        this.totalPrice = total;
        return this.totalPrice;
    }
    @Override
    public String getDescription() {
     String desc = this.name;
     desc += "(";
        for(menuItem item : items){
            desc += item.getName() + "+";
        }
    desc = desc.substring(0, desc.length()-1); 
    desc+=")";  
    return desc;
    }   
    
    public void addItem(menuItem item){
        this.items.add(item);
        this.totalPrice += item.getPrice();
    }

    public void addFreeItem(menuItem item){
        this.items.add(new freeItem(item.getName()));
    }
    
    public void addDiscount(double discount){
          this.discount = discount;
          this.discountedPrice = this.totalPrice*(1-discount/100);
    }


    public menuItem removeItem(menuItem item){
        menuItem removed = null;
        for(menuItem i : items){
            if(i.getName().equalsIgnoreCase(item.getName())){
                removed = i;
                items.remove(i);
                break;
            }
        }
        return removed;
    }

    public menuItem getItem(String name){
        for(menuItem item : items){
            if(item.getName().equalsIgnoreCase(name)){
                return item;
            }
        }
        return null;
    }

    public List<menuItem> getItems(){
        return this.items;
    }

     public String showDetails(){
        
        String details = "";
        details+= this.name + ":\n";

        for(menuItem item : this.items){
            details+= "  -"+item.getDescription() + '\n';
        }
        
        details+= "Total Price: " + this.totalPrice;
        if(discount!=0){
            details+= '\n' + "Discount: " + discount + "%" + '\n' + "Discounted total: " + this.discountedPrice;
        }
        return details;
}
}
