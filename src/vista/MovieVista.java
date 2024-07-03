package vista;

import controlador.MovieControlador;
import modelo.Movie;

public class MovieVista {
    public static void main(String[] args) {
         MovieControlador mc = new MovieControlador();
         mc.mostrar();
    }
}
