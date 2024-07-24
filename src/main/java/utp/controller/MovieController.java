package utp.controller;

import java.time.LocalDate;
import java.util.ArrayList;

import utp.database.CineplanetDB;
import utp.model.Movie;
import utp.model.Time;
import utp.store.Store;

public class MovieController {

    private Store store;

    public MovieController() {

        store = Store.getInstance();

    }

    //trae la pelicula que se selecciono
    public Movie getStoreMovie() {

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
