package Menu;
import java.util.ArrayList;
import java.util.List;
import Items.menuItem;


public class Menu {
    private List<menuItem> items;

    public Menu(){
        this.items = new ArrayList<menuItem>();
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
    

    public String getMenu(){
        String menu = "";
        for(menuItem item : items){
            menu += item.getDescription() + " - " + item.getPrice() + "\n";
        }
        return menu;
    }

}
