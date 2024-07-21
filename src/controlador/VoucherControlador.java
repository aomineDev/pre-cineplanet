package controlador;

import bd.Cine;
import modelo.Butaca;
import modelo.Movie;
import tienda.Tienda;

public class VoucherControlador {

    private Tienda tienda;
    private Cine cine;

    public VoucherControlador() {

        tienda = Tienda.getInstance();
        cine = Cine.getInstace();
    }

    public Movie getMovie(){
        return tienda.getSelectedMovie();
    }

    public Butaca getButaca(){

        int Butacaid= tienda.getSelectedIdButaca();
        
        for ( Butaca butaca : cine.getButacas()){
            if ( butaca.getButacaId() == Butacaid){
                return butaca; 
            }
        }
        return  null;
    }
    public int getFila(char filaLetras){

        if ( filaLetras == 'A'){
            return 0;

        }else if (filaLetras == 'B'){
            return 1;

        }else if (filaLetras == 'C'){
            return 2;

        }else if (filaLetras == 'D'){
            return 3; 

        }else if (filaLetras == 'E'){
            return 4;

        }else if (filaLetras == 'F'){
            return 5;

        }else if (filaLetras == 'G'){
            return 6;

        }else if (filaLetras == 'H'){
            return 7;
        }
        
        return 0;
    }


    public void setButacasOcupadas(){
        Butaca butaca = getButaca();

        for ( String ButacaSeleccionada : tienda.getSelectedButacas() ){
            int fila= getFila( ButacaSeleccionada.charAt(0));
            int columna= Integer.parseInt(ButacaSeleccionada.substring(1))-1;
            
            // C 64 

            butaca.updateEstadoButaca(fila, columna);
        }
        tienda.getSelectedButacas().clear();
    }




    
}
