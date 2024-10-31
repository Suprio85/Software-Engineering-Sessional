package Items;
import java.util.ArrayList;
import java.util.List;
public class Combo implements menuItem {
    String name;
    List<menuItem> items ;
    
    public Combo(String name){
        this.name = name;
        this.items = new ArrayList<menuItem>();
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
        return total;
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

    public String showItems(){
        String items = "";
        for(menuItem item : this.items){
            items+=item.getDescription()+"\n";
        }
        return items;
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

    public String showPrice(){
        return "Total Price: " + this.getPrice()+"\n";
    }

    public String showDetails(){
        return this.getName()+'\n'+this.showItems()+'\n' + this.showPrice();
    }
}
