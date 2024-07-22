package utp.model;

import java.util.ArrayList;

public class Format {

    //atributos
    private String format;
    private double ticketPrice;
    private ArrayList<Date> dateList;

    //constructor
    public Format(String format, double ticketPrice, ArrayList<Date> dateList) {

        this.ticketPrice = ticketPrice;
        this.format = format;
        this.dateList = new ArrayList<>(dateList);

    }

    public ArrayList<Date> getDateList() {
        return dateList;
    }

    public String getFormat() {
        return format;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }
    
}
