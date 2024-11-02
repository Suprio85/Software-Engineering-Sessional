import java.util.Scanner;
import Decorator.discountDecorator;
import Decorator.freeItemDecorator;
import Items.Combo;
import Items.menuItem;
import Items.singleItem;
import Menu.Menu;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.addItem(new singleItem("Burger", 300));
        menu.addItem(new singleItem("Fries", 100));
        menu.addItem(new singleItem("Wedges", 150));
        menu.addItem(new singleItem("Shawarma", 200));
        menu.addItem(new singleItem("Drink", 25));
       
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println(menu.getMenu());
            while(true)
            {
                System.out.println("Press 1 to create a combo, 2 to view menu, 0 to exit:");
                int choice = sc.nextInt();
                double discount = 0;
                switch (choice) {
                    case 1:{
                        System.out.println("Enter the name of the combo:");
                        sc.nextLine();
                        String name = sc.nextLine();
                        System.out.println("Creating a new combo: " + name);
                        Combo newcombo = new Combo(name);
                        while (true) {
                          System.out.println("Available commands: Add [item], Remove [item], Free [item], Discount [percentage], Done");
                          String command = sc.nextLine();
                            if (command.equalsIgnoreCase("Done")) {
                                if(discount!=0){
                                    newcombo = new discountDecorator(newcombo, discount);
                                }
                                System.out.println(newcombo.showDetails());
                                menu.addItem(newcombo);
                                break;
                            }
                            String[] tokens = command.split(" ");
                            if (tokens[0].equalsIgnoreCase("Add")) {
                                menuItem item = menu.getItem(tokens[1]);
                                if(item!=null){
                                   newcombo = new Combo(newcombo);
                                   newcombo.addItem(item);
                                }
                                
                            } else if (tokens[0].equalsIgnoreCase("Remove")) {
                                menuItem item = menu.getItem(tokens[1]);
                                if(item!=null && newcombo.getItem(tokens[1])!=null){
                                    newcombo.removeItem(item);
                                }
                                
                            } else if (tokens[0].equalsIgnoreCase("Free")) {
                                menuItem item = menu.getItem(tokens[1]);
                                if(item!=null){
                                    newcombo = new freeItemDecorator(newcombo);
                                    newcombo.addItem(item);
                                }
                                
                            } else if (tokens[0].equalsIgnoreCase("Discount")) {
                                discount = Double.parseDouble(tokens[1]);  
                            }
                            
                        }
                    }
                    break;
                    case 2:{
                        System.out.println(menu.getMenu());
                    }
                    break;
                    case 0:{
                        sc.close();
                        System.exit(0);
                    }
                    default:
                    System.out.println("Invalid Input");
                    break;
                }
            }

        }catch(Exception e){
            System.out.println("Invalid Input");
            sc.close();
        }



      
    }
}