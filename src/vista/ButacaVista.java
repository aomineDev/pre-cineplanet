package vista;

import controlador.ButacaControlador;
import modelo.Butaca;

public class ButacaVista {

    public static void main(String[] args) {
        
        ButacaControlador butacaControlador = new ButacaControlador();
        Butaca butaca = butacaControlador.getButaca();
        String[][] butacas = butaca.getButacas();

        System.out.println("");
        System.out.println(butaca.getNumeroSala());

        for (int i = 0; i < butacas.length; i++){

            for (int j = 0; j < butacas[i].length; j++) {

                System.out.print(butacas[i][j]);

            }

            System.out.println("");
            
        }

    }
    
}
