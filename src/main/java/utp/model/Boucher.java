package utp.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Boucher {
    
    private String clientName;
    private String title;
    private String format;
    private LocalDate date;
    private LocalTime time;
    private ArrayList<String> selectedSeat;
    private double ticketPrice;
    private int roomNumber;
    
    public Boucher(String clientName, String title, String format, LocalDate date, LocalTime time,
            ArrayList<String> selectedSeat, double ticketPrice, int roomNumber) {
        this.clientName = clientName;
        this.title = title;
        this.format = format;
        this.date = date;
        this.time = time;
        this.selectedSeat = selectedSeat;
        this.ticketPrice = ticketPrice;
        this.roomNumber = roomNumber;
    }
    public String getClientName() {
        return clientName;
    }
    public String getTitle() {
        return title;
    }
    public String getFormat() {
        return format;
    }
    public LocalDate getDate() {
        return date;
    }
    public LocalTime getTime() {
        return time;
    }
    public ArrayList<String> getSelectedSeat() {
        return selectedSeat;
    }
    public double getTicketPrice() {
        return ticketPrice;
    }
    public int getRoomNumber() {
        return roomNumber;
    }

    
}
