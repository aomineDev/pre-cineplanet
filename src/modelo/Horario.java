package modelo;

import java.time.LocalTime;

public class Horario {
    private LocalTime hora;
    private int butacaId;

    public Horario(LocalTime hora, int butacaId){
        this.hora = hora;
        this.butacaId = butacaId;
    }

    public LocalTime getHora(){
        return this.hora;
    }
    public int getButacaId(){
        return this.butacaId;
    }
}
