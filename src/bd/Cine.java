package bd;

import java.util.ArrayList;

import modelo.Movie;
import modelo.User;

public class Cine {
//atributos
    private ArrayList<User> userList;
    private ArrayList<Movie>movielist;

    //metodo constructor vacio
    public Cine() {

        userList = new ArrayList<>();
        movielist = new ArrayList<>();
        // Añadiendo usuarios a ArrayList 
        userList.add(new User("Manuel", "145"));
        userList.add(new User("Mirella", "234"));
        userList.add(new User("Leo", "566"));
        userList.add(new User("Kaory", "345"));
        userList.add(new User("Roxi", "1070"));
        //Añadiendo peliculas a Arraylist
        movielist.add(new Movie("Intensamente 2"));
        movielist.add(new Movie("BAD BOYS"));
        movielist.add(new Movie("Deadpool"));
    }

    public ArrayList<User> getUserList() {
        return userList;
    }
    public ArrayList<Movie> getMovielist() {
        return movielist;
    }

}
