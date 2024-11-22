package User;

import java.util.ArrayList;
import java.util.List;

public class movieUser  implements user{
    private String name;
    private List<String> favouriteGenres;

    public movieUser(String name) {
        this.favouriteGenres = new ArrayList<String>();
        this.name = name;
    }

    @Override
    public void getNotification(String MovieName, String genre) {
        if (favouriteGenres.contains(genre)) {
            System.out.println("Hey " + name + ", a new " + genre + " movie " + MovieName + " is out!");
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<String> getFavouriteGenres() {
        return favouriteGenres;
    }
    
    @Override
    public void addFavouriteGenre(String genre) {
        favouriteGenres.add(genre);
    }
   
    @Override
    public void removeFavouriteGenre(String genre) {
        favouriteGenres.remove(genre);
    }
}
