package utp.controller;

import java.time.LocalDate;
import java.util.ArrayList;

import utp.database.CineplanetDB;
import utp.model.Movie;
import utp.model.Time;
import utp.store.Store;

public class MovieController {

    private Store store;
    private CineplanetDB cineplanetDB;
    private ArrayList<Movie> movieList;

    public MovieController() {

        store = Store.getInstance();
        cineplanetDB = CineplanetDB.getInstance();
        movieList = cineplanetDB.getMovieList();

    }

    //es prueba
    public void SelecMovie() {

        store.setMovie(movieList.get(1));

    }

    //trae la pelicula que se selecciono
    public Movie getStoreMovie() {

        SelecMovie();

        return store.getMovie();

    }

    //metodo para enviar el formato al store
    public void setFormat(String format) {

        store.setFormat(format);

    }

    //metodo para enviar la fecha al store
    public void setDate(LocalDate date) {

        store.setDate(date);

    }

    //metodo para enviar el precio al store
    public void setTicket(Double ticketPrice) {

        store.setTicketPrice(ticketPrice);

    }

    //metodo para enviar el horario al store
    public void setTime(Time time){

        store.setTime(time);

    } 
    
}
