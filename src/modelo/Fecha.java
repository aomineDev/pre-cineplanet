package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Fecha {
    
    private LocalDate fecha;
    private ArrayList<Horario> horarioList;

    public Fecha(LocalDate fecha, ArrayList<Horario> horarioList ){
        this.fecha= fecha;
        this.horarioList= horarioList;
    }

    //metodo para obtener el valor de los atributos con get

    public LocalDate getFecha(){
        return this.fecha;
    }
    public ArrayList<Horario> getHorarioList() {
        return horarioList;
    }
}
