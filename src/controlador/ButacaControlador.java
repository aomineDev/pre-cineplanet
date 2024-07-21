package controlador;

import bd.Cine;
import modelo.Butaca;
import tienda.Tienda;

public class ButacaControlador {

    Tienda tienda;
    Cine cine;

    public ButacaControlador() {

        tienda = Tienda.getInstance();
        cine = Cine.getInstace();

    }

    public Butaca getButaca() {

        int id = tienda.getSelectedIdButaca();

        for (Butaca butaca : cine.geButacas()) {

            if(id == butaca.getButacaId()) {

                return butaca;

            }

        }

        return null;

    }
    public String getPosicionButaca(int fila, int columna){
       
        String filacon="";

        if (fila == 0){

            filacon= "A";

        }else if (fila == 1){

            filacon= "B";

        }else if (fila == 2){

            filacon= "C";

        }else if (fila == 3){

            filacon= "D";

        }else if (fila == 4){

            filacon= "E";

        }else if (fila == 5){

            filacon= "F";
            
        }else if (fila == 6){

            filacon= "G";

        }else if (fila == 7){

             filacon= "H";

        } 
     return filacon+(columna+1);
    
    }
    
}
