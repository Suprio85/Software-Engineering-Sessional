import java.util.Scanner;

import builder.ibuilder;
import builder.ticketingSystemBuilder;
import component.WebServer.Django;
import component.WebServer.Ruby;
import component.WebServer.nodeJS;
import component.WebServer.webServer;
import component.internetConnection.GSM;
import component.internetConnection.Internet;
import component.internetConnection.Wifi;
import director.Director;
import factory.*;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter The Type of Package you want to create: ");
            System.out.println("1. Basic Package");
            System.out.println("2. Standard Package");
            System.out.println("3. Advanced Package");
            System.out.println("4. Premium Package");

            int choice = sc.nextInt();
            packageFactory packageFactory = null;
            switch(choice){
                case 1:
                    packageFactory = new basicPackageFactory();
                    break;
                case 2:
                    packageFactory = new standardPackageFactory();
                    break;
                case 3:
                    packageFactory = new AdvancedPackageFactory();
                    break;
                case 4:
                    packageFactory = new PremiumPackageFactory();
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

            System.out.println("Enter the Type of internet-connection you want: ");
            System.out.println("1. GSM");
            System.out.println("2. Wifi");
            if(choice == 4 || choice == 3)
            System.out.println("3. Ethernet");

            int internetChoice = sc.nextInt();
            Internet internet = null;

            switch (internetChoice) {
                case 1:
                     internet = new GSM();
                    break;
                case 2:
                     internet = new Wifi();
                    break;
                case 3:
                    internet = new Wifi();
                    break;
                default:
                    break;
            }

            int webServerChoice;
            System.out.println("Enter the Type of WebServer you want: ");
            System.out.println("1. Django");
            System.out.println("2. nodejs");
            System.out.println("3. Ruby");
            webServerChoice = sc.nextInt();

            webServer webServer = null;

            switch (webServerChoice) {
                case 1:
                    webServer = new Django();
                    break;
                case 2:
                    webServer = new nodeJS();
                    break;
                case 3:
                    webServer = new Ruby();
                    break;
                default:
                    break;
            }

          ibuilder ticketingSystemBuilder = new ticketingSystemBuilder();

          Director  director = new Director(ticketingSystemBuilder, packageFactory.createPackage(), internet, webServer);
          director.construct();



        
        }catch(Exception e){
            System.out.println("Error: "+e);

        }finally{
            sc.close();
        }
       
    }
    
}
