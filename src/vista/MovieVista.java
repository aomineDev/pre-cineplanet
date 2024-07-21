package vista;

import java.util.ArrayList;

import controlador.MovieControlador;
import modelo.Fecha;
import modelo.Formato;
import modelo.Horario;
import modelo.Movie;

public class MovieVista {

    public static void main(String[] args) {
        
        MovieControlador movieControlador = new MovieControlador();
        Movie movie = movieControlador.getSelectedMovie();

        ArrayList<Formato> formatoList = movie.getFormatoList();
        ArrayList<Fecha> fechaList = formatoList.get(1).getFechalist(); 
        ArrayList<Horario> horaList = fechaList.get(0).getHorarioList();

        System.out.println();
        System.out.println(" ----- PELICULA ----- ");
        System.out.println(movie.getTitulo());

        for(Formato fmt : formatoList) {

            System.out.println(fmt.getFormato());
            
        }

        for(Fecha fecha : fechaList) {

            System.out.println(fecha.getFecha());

        }

        for(Horario horario : horaList) {

            System.out.println(horario.getHora());

        }

        movieControlador.setSelectedIdButaca(horaList.get(0).getButacaId());

        ButacaVista.main(args);

    }
    
}
