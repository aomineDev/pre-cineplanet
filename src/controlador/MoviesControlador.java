package controlador;

import java.util.ArrayList;

import bd.Cine;
import modelo.Movie;
import tienda.Tienda;

public class MoviesControlador {

    //atributos
    private Cine cine;
    private Tienda tienda;
    private ArrayList<Movie> movieList;

    //metodo construtor
    public MoviesControlador () {
        cine = Cine.getInstace();
        tienda = Tienda.getInstance();
        movieList = cine.getMovielist();
    }

    public ArrayList<Movie> getMovies() {
        return movieList;
    }

    //selec pelis
    public void SelecMovie() {

        tienda.setSelectedMovie(movieList.get(1));

    }
}
