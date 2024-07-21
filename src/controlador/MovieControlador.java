package controlador;

import modelo.Movie;
import tienda.Tienda;

public class MovieControlador {

   private Tienda tienda;

   public MovieControlador() {

        tienda = Tienda.getInstance();

   }

   public Movie getSelectedMovie() {

        return tienda.getSelectedMovie();

   }

   public void setSelectedIdButaca(int id) {
     tienda.setSelectedIdButaca(id);
   }

    
}
