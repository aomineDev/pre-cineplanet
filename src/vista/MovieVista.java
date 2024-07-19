package vista;

import controlador.MovieControlador;
import modelo.Movie;
import tienda.Tienda;

public class MovieVista {
    public static void main(String[] args) {

        MovieControlador mc = new MovieControlador();
        Tienda tienda = Tienda.getInstance();
        
        System.out.println("");
        System.out.println("Hola de nuevo: " + tienda.getUser().getUsuario());
        
        for(Movie movie : mc.getMovies()) {
            System.out.println(movie.getTitulo());
        }
         
    }
}
