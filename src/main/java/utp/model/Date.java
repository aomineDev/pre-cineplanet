package utp.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Date {

    //atributos
    private LocalDate date;
    private ArrayList<Time> timeList;

    //constructor
    public Date(LocalDate date, ArrayList<Time> timeList) {

        this.date = date;
        this.timeList = new ArrayList<>(timeList);

    }

    public LocalDate getDate() {
        return date;
    }

    public ArrayList<Time> getTimeList() {
        return timeList;
    }
    
}
