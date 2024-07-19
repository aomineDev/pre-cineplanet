package controlador;

import modelo.Movie;
import tienda.Tienda;

public class MovieControlador {

   private Tienda tienda;
   private Movie selectedMovie;

   public MovieControlador() {

        tienda = Tienda.getInstance();

   }

   public Movie getSelectedMovie() {

        return tienda.getSelectedMovie();

   }
    
}
