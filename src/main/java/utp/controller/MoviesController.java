package utp.controller;

import java.util.ArrayList;

import utp.database.CineplanetDB;
import utp.model.Movie;
import utp.model.User;
import utp.store.Store;

public class MoviesController {

    private ArrayList<Movie> movieList;
    private Store store;

    public MoviesController () {
        movieList = CineplanetDB.getInstance().getMovieList();
        store = Store.getInstance();

    }

    public ArrayList<Movie> getMovieList() {
        return movieList;
    }

    public User getStoreUser() {

        return store.getUser();
        
    }

    public void setStoreMovie(Movie movie) {

        store.setMovie(movie);

    }
}
