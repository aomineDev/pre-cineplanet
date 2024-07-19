package tienda;

import modelo.Movie;
import modelo.User;

public class Tienda {

    //atributos
    private static Tienda instance;
    User user;
    Movie selectedMovie;

    private Tienda () {

    }

    //singleton
    public static Tienda getInstance() {
        
        if (instance == null) {
            instance = new Tienda();
        }
        
        return instance;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setSelectedMovie(Movie selectedMovie) {
        this.selectedMovie = selectedMovie;
    }

    public Movie getSelectedMovie() {
        return selectedMovie;
    }
    
}
