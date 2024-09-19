package Problem2;

import java.util.Scanner;

import Problem2.Customer.Customer;
import Problem2.Customer.VIPCustomer;
import Problem2.Customer.premiumCustomer;
import Problem2.Customer.regularCustomer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{

            Customer customer = null;
            System.out.println("Enter the type of Customer: ");
            System.out.println("1. Regular Customer");
            System.out.println("2. Premium Customer");
            System.out.println("3. VIP Customer");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    customer = new regularCustomer();
                    break;
                case 2:
                    customer = new premiumCustomer();
                    break;
                case 3:
                    customer = new VIPCustomer();
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

            bankService bankService = new bankService(customer);
            System.out.println("Enter the amount(BDT): ");
            double amount = scanner.nextDouble();
            System.out.println("Enter the time(years): ");
            int time = scanner.nextInt();
            bankService.calculateInterest(amount, time);
            System.out.println(bankService);

        }catch(Exception e){
            System.out.println("Invalid Input");
        }finally{
            scanner.close();
        }


    }
}
