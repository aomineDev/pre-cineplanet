package vista;

import controlador.MoviesControlador;
import modelo.Movie;
import tienda.Tienda;

public class MoviesVista {
    public static void main(String[] args) {

        MoviesControlador mc = new MoviesControlador();
        Tienda tienda = Tienda.getInstance();
        
        System.out.println("");
        System.out.println("Hola de nuevo: " + tienda.getUser().getUsuario());
        
        for(Movie movie : mc.getMovies()) {
            System.out.println(movie.getTitulo());
        }

        mc.SelecMovie();

        MovieVista.main(args);
         
    }
}
