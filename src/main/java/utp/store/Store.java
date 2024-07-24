package utp.store;

import java.util.ArrayList;

import utp.model.Movie;
import utp.model.Time;
import utp.model.User;
import utp.model.Seat;

public class Store {

    //instancia unica
    private static Store instance;
    private User user;
    private Movie movie;
    private String format;
    private String date;
    private Time time;
    private double ticketPrice;
    private Seat seat;
    private ArrayList <String> selectedSeats;

    private Store() {

        selectedSeats= new ArrayList<>();
    }

    public Seat getSeat() {
      return seat;
    }

    public void setSeat(Seat seat) {
      this.seat = seat;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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
