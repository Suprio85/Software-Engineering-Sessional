package User;

import java.util.List;

public interface user {
    void getNotification(String MovieName, String genre);
    String getName();
    List<String> getFavouriteGenres();
    void addFavouriteGenre(String genre);
    void removeFavouriteGenre(String genre);
    
}
