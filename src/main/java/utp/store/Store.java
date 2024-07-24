package utp.store;

import java.time.LocalDate;
import java.util.ArrayList;

import utp.model.Movie;
import utp.model.Time;

public class Store {

    //instancia unica
    private static Store instance;
    private Movie movie;
    private String format;
    private LocalDate date;
    private double ticketPrice;
    private Time time;
    private ArrayList <String> selectedSeats;

    private Store() {

        selectedSeats= new ArrayList<>();
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    public ArrayList<String> getSelectedSeats() {
        return selectedSeats;
    }

    //patron de diseño singleton
    public static Store getInstance() {
        
        if (instance == null) {

            instance = new Store();

        }
        
        return instance;
    }
  
}
