package Subject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import User.user;



public class Genre {
    private Map<String, List<user>> genresubscribers;
    private List<user> users;

    public Genre(){
        this.genresubscribers = new HashMap<String, List<user>>();

        this.genresubscribers.put("THRILLER", new ArrayList<user>());
        this.genresubscribers.put("HORROR", new ArrayList<user>());
        this.genresubscribers.put("COMEDY", new ArrayList<user>());
        this.users = new ArrayList<user>();

    }

    public void Subscribe(user newuser,String genre ){
       
       user subUser = null;
       for(var user : users){
        if(user.getName().equalsIgnoreCase(newuser.getName())){
            subUser = user;
            break;
        }
     }

        if(subUser == null){
            System.out.println("User not Registered");
        }

        if(this.genresubscribers.get(genre).contains(subUser)){
            System.out.println("User already subscribed to this genre");
        }else{

            this.genresubscribers.get(genre).add(subUser);
            subUser.addFavouriteGenre(genre);
        }              

    }

    public void unSubscribe(user olduser){
        user unsubUser = null;

        for(var user : users){
            if(user.getName().equalsIgnoreCase(olduser.getName())){
                unsubUser = user;
                break;
            }
        }

        if(unsubUser == null){
            System.out.println("User not Registered or already unsubscribed");
        }
        


        for(var genre : unsubUser.getFavouriteGenres()){
            if(this.genresubscribers.get(genre).contains(unsubUser)){
                this.genresubscribers.get(genre).remove(unsubUser);
                unsubUser.removeFavouriteGenre(genre);
            };
        }
       
    }

    public void unSubscribe(user newuser,String genre ){
        user unsubUser = null;

        for(var user : users){
            if(user.getName().equalsIgnoreCase(newuser.getName())){
                unsubUser = user;
                break;
            }
        }

        if(unsubUser == null){
            System.out.println("User not Registered or already unsubscribed");
        }
        
        if(this.genresubscribers.get(genre).contains(unsubUser)){
            this.genresubscribers.get(genre).remove(unsubUser);
            unsubUser.removeFavouriteGenre(genre);
        }else{
            System.out.println("User not subscribed to this genre");
        }
    }

    public void addSubscriber(user newuser){
        this.users.add(newuser);
    }

    public void removeSubscriber(user newuser){
        this.users.remove(newuser);
    }



    public void uploadMovie(String moviename, String genre){
        System.out.println("New movie upload: " + moviename + "Genre:(" + genre + ")");

        List<user> subscribers = this.genresubscribers.get(genre);

        for(var u : subscribers){
          
            new Thread(()->u.getNotification(moviename, genre)).start();
        }
    }


    public void addGenre(String genre){
        this.genresubscribers.put(genre, new ArrayList<user>());
    }

    public void removeGenre(String genre){
        this.genresubscribers.remove(genre);
    }

    public void showAllUsers(){
        for(var user : users){
            System.out.println(user.getName());
            if(user.getFavouriteGenres().size() == 0){
                System.out.println("No Favourite Genres");
                continue;
            }
            System.out.print("Favourite Genres: ");
            System.out.println(user.getFavouriteGenres());
        }
    }


}
