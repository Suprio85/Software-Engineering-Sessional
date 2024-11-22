import java.util.Scanner;

import Subject.Genre;
import User.*;

public class Main {

    public static void main(String[] args) {

       Genre desiFlix = new Genre();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Register New User");
            System.out.println("2. Add New Genre");
            System.out.println("3. Add New Movie in a Genre");
            System.out.println("4. Add Favourite Genre of a User");
            System.out.println("5. Show All Users");
            System.out.println("6. Unsubscribe User from a Genre");
            System.out.println("7. Unsubscribe User");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter user name: ");
                    String userName = scanner.nextLine();
                    user newUser = new movieUser(userName);
                    desiFlix.addSubscriber(newUser);
                    System.out.println("User " + userName + " registered successfully.");

                    break;

                case 2:
                    System.out.print("Enter new genre: ");
                    String newGenre = scanner.nextLine();
                    desiFlix.addGenre(newGenre);
                    System.out.println("Genre " + newGenre + " added successfully.");
                    break;

                case 3:
                    System.out.print("Enter movie name: ");
                    String movieName = scanner.nextLine();
                    System.out.print("Enter genre: ");
                    String genre = scanner.nextLine().toUpperCase();
                    desiFlix.uploadMovie(movieName, genre);
                    break;

                case 4:
                    System.out.print("Enter user name: ");
                    String favUser = scanner.nextLine();
                    System.out.print("Enter favourite genre: ");
                    String favGenre = scanner.nextLine().toUpperCase();
                    desiFlix.Subscribe(new movieUser(favUser), favGenre);
                    System.out.println(favUser + " subscribed to " + favGenre + ".");
                    break;

                case 5:
                //  desiFlix.showAllUsers();
                    break;
                case 6:
                    System.out.print("Enter user name: ");
                    String unsubUser = scanner.nextLine();
                    System.out.print("Enter genre to unsubscribe from: ");
                    String unsubGenre = scanner.nextLine().toUpperCase();
                    desiFlix.unSubscribe(new movieUser(unsubUser), unsubGenre);
                    System.out.println(unsubUser + " unsubscribed from " + unsubGenre + ".");
                    break;

                case 7:
                    System.out.print("Enter user name: ");
                    String unsubUser1 = scanner.nextLine();
                    desiFlix.unSubscribe(new movieUser(unsubUser1));
                    System.out.println(unsubUser1 + " unsubscribed from all genres.");
                    break;

                case 8:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
    }
    
}
