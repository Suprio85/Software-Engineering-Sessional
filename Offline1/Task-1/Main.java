import java.util.Scanner;

import builder.ibuilder;
import builder.ticketingSystemBuilder;
import component.WebServer.webServer;
import component.internetConnection.Internet;
import director.Director;
import factory.AdvancedPackageFactory;
import factory.PremiumPackageFactory;
import factory.basicPackageFactory;
import factory.packageFactory;
import factory.standardPackageFactory;
import factory.internetFactory.GSMFactory;
import factory.internetFactory.ethernetFactory;
import factory.internetFactory.wifiFactory;
import factory.webServerFactory.djangoFactory;
import factory.webServerFactory.nodejsFactory;
import factory.webServerFactory.rubyFactory;




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
                    System.out.println("Invalid Choice.Please choose again between 1-4");
                    return;
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
                     internet = new GSMFactory().createInternet();
                    break;
                case 2:
                     internet = new wifiFactory().createInternet();
                    break;
                case 3:
                    if (choice == 1 || choice == 2){
                        System.out.println("Inavalid choice.Ethernet is not available for Basic and Standard Package");
                        return;
                    }
                    internet = new ethernetFactory().createInternet();
                    break;
                default:
                    System.out.println("Invalid Choice");
                    return;
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
                    webServer = new djangoFactory().createWebServer();
                    break;
                case 2:
                    webServer = new nodejsFactory().createWebServer();
                    break;
                case 3:
                    webServer = new rubyFactory().createWebServer();
                    break;
                default:
                    System.out.println("Invalid choice. Please make a choice between 1-3");
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
