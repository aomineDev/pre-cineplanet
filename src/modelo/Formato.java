package modelo;

import java.util.ArrayList;

public class Formato {
    private String formato;
    private ArrayList<Fecha> fechalist;

    public Formato(String formato, ArrayList<Fecha> fechalist){
        this.formato = formato;
        this.fechalist = new ArrayList<>(fechalist);
    }

    public String getFormato() {
        return formato;
    }
    
    public ArrayList<Fecha> getFechalist() {
        return fechalist;
    }

}
