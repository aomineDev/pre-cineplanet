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
