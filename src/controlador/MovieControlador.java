package controlador;

import java.util.ArrayList;

import bd.Cine;
import modelo.Movie;

public class MovieControlador {

    //atributos
    private Cine cine;
    private ArrayList<Movie> movieList;

    //metodo construtor
    public MovieControlador () {
        cine = Cine.getInstace();
        movieList = cine.getMovielist();
    }

    public ArrayList<Movie> getMovies() {
        return movieList;
    }
}
