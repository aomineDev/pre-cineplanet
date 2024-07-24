package utp.controller;

import java.util.ArrayList;

import utp.database.CineplanetDB;
import utp.model.Movie;

public class MoviesController {
    private ArrayList<Movie> movieList;

    public MoviesController () {
        movieList = CineplanetDB.getInstance().getMovieList();

    }
    public ArrayList<Movie> getMovieList() {
        return movieList;
    }
}
