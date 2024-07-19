package modelo;

public class Butaca {
    
    private int butacaId;
    private int numeroSala;
    private String [][] butacas = {
        {"V","L","L","L","L","L","V","V","V","V","V","V","L","L","L","L","V","V","V"},
        {"V","L","L","L","L","L","L","L","L","L","L","L","L","L","L","L","V","V","V"},
        {"V","L","L","L","L","L","L","L","L","L","L","L","L","L","L","L","V","V","V"},
        {"V","L","L","L","L","L","L","L","L","L","L","L","L","L","L","L","V","V","V"},
        {"V","L","L","L","L","L","L","L","L","L","L","L","L","L","L","L","L","L","L"},
        {"V","L","L","L","L","L","L","L","L","L","L","L","L","L","L","L","L","L","L"},
        {"V","L","L","L","L","L","L","L","L","L","L","L","L","L","L","L","L","L","L"},
        {"L","L","L","L","L","L","L","L","L","L","L","L","L","L","L","L","L","L","L"},
    };
    public Butaca(int butacaId,int 
    numeroSala){
        this.butacaId= butacaId;
        this.numeroSala= numeroSala;
    }
    public int getButacaId() {
        return butacaId;
    }
    public int getNumeroSala() {
        return numeroSala;
    }
    public String[][] getButacas(){
        return butacas;
    }

}
