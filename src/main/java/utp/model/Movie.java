package utp.model;

import java.time.LocalTime;
import java.util.ArrayList;

public class Movie {

    //atributos
    private String title;
    private String cover;
    private String gender;
    private String category;
    private boolean isInPremiere;
    private LocalTime duration;
    private ArrayList<Format> formatList;

    //constructor
    public Movie(String title, String cover, String gender, String category, boolean isInPremiere, LocalTime duration, ArrayList<Format> formatList) {

        this.formatList = new ArrayList<>(formatList);
        this.category = category;
        this.cover = cover;
        this.duration = duration;
        this.gender = gender;
        this.isInPremiere = isInPremiere;
        this.title = title;

    }

    public String getCategory() {
        return category;
    }

    public String getCover() {
        return cover;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public ArrayList<Format> getFormatList() {
        return formatList;
    }

    public String getGender() {
       
        return gender;
    }

    public String getTitle() {
        return title;
    }

    public boolean getIsInPremiere() {
        return isInPremiere;
    }
    
}
