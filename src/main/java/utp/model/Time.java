package utp.model;

import java.time.LocalTime;

public class Time {

    //atributos
    private LocalTime time;
    private int seatId;

    //constructor
    public Time(LocalTime time, int seatId) {

        this.seatId = seatId;
        this.time = time;

    }

    public int getSeatId() {
        return seatId;
    }

    public LocalTime getTime() {
        return time;
    }
    
}
