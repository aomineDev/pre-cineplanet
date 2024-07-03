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
        cine = new Cine();
        movieList = cine.getMovielist();
    }
    public void mostrar(){
        for(Movie m : movieList){
            System.out.println(m.getTitulo());
        }
    }
}
