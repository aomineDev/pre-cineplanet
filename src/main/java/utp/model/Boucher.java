package utp.model;

import java.util.ArrayList;

public class Boucher {
    
    private String clientName;
    private String title;
    private String format;
    private String date;
    private String time;
    private ArrayList<String> selectedSeat;
    private double ticketPrice;
    private int roomNumber;
    
    public Boucher(String clientName, String title, String format, String date, String time,
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
    public String getDate() {
        return date;
    }
    public String getTime() {
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
