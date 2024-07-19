package vista;

import controlador.MovieControlador;
import modelo.Formato;
import modelo.Movie;

public class MovieVista {

    public static void main(String[] args) {
        
        MovieControlador movieControlador = new MovieControlador();
        Movie movie = movieControlador.getSelectedMovie();

        System.out.println();
        System.out.println(" ----- PELICULA ----- ");
        System.out.println(movie.getTitulo());
        for(Formato fmt : movie.getFormatoList()) {

            System.out.println(fmt.getFormato());
            System.out.println(fmt.getFechalist().get(0).getFecha());

        }


    }
    
}
