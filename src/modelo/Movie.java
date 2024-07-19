package modelo;

import java.util.ArrayList;
public class Movie {
    
    //atributos 
    private String titulo;
    private ArrayList<Formato> formatoList;

    //metodo constructor 
    public Movie (String titulo){
        this.titulo= titulo;
        //this.formatoList= formatoList;
    }

    //metodo get
    public String getTitulo() {
        return titulo;
    }

    public ArrayList<Formato> getFormatoList() {
        return formatoList;
    }
}
