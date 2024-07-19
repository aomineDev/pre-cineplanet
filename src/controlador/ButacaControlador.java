package controlador;

import bd.Cine;
import modelo.Butaca;
import tienda.Tienda;

public class ButacaControlador {

    Tienda tienda = Tienda.getInstance();
    Cine cine = Cine.getInstace();

    public Butaca getButaca() {

        int id = tienda.getSelectedIdButaca();

        for (Butaca butaca : cine.geButacas()) {

            if(id == butaca.getButacaId()) {

                return butaca;

            }

        }

        return null;

    }
    
}
