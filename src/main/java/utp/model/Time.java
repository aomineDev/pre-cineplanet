package utp.model;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {

    //atributos
    private LocalTime time;
    private int seatId;

    //constructor
    public Time(LocalTime time, int seatId) {

        this.seatId = seatId;
        this.time = time;

    }

    public String getFormattedTime() {

        return this.time.format(DateTimeFormatter.ofPattern("h:mm a"));

    }

    public int getSeatId() {
        return seatId;
    }

    public LocalTime getTime() {
        return time;
    }
    
}
