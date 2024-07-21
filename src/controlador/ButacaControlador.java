package controlador;

import java.util.ArrayList;

import bd.Cine;
import modelo.Butaca;
import tienda.Tienda;

public class ButacaControlador {

    private Tienda tienda;
    private Cine cine;
    private ArrayList<String> selectedButacas;

    public ButacaControlador() {

        tienda = Tienda.getInstance();
        cine = Cine.getInstace();
        selectedButacas = tienda.getSelectedButacas();
        
    }

    public Butaca getButaca() {

        int id = tienda.getSelectedIdButaca();

        for (Butaca butaca : cine.getButacas()) {

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

    public ArrayList<String> getSelectedButacas() {

        return selectedButacas;

    }

    //añadir seleccion de butacas
    public void addSelectedButacas(String positionButaca) {

        selectedButacas.add(positionButaca);

    }

    public void deleteSelectedButacas(String positionButaca) {

        int index = selectedButacas.indexOf(positionButaca);

        selectedButacas.remove(index);

    }

    public String getSelectedButacaToString() {

        String str = selectedButacas.toString();

        //return str.substring(1, str.length()-1);

        return str.replace("[", "").replace("]", "");
    }
    
}
