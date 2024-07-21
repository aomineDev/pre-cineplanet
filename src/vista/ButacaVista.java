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

                if (butacas[i][j] .equals("V")){
                   System.out.print("     ");
                }else if (butacas[i][j] .equals("L")){

                    System.out.print(" - " + butacaControlador.getPosicionButaca(i, j)  );
                }
            
            }

            System.out.println("");
        }

        butacaControlador.addSelectedButacas("A3");
        butacaControlador.addSelectedButacas("B13");
        butacaControlador.addSelectedButacas("H14");

        butacaControlador.deleteSelectedButacas("B13");

        System.out.println("Butacas seleccionadas: " + butacaControlador.getSelectedButacaToString());

    }
    
}
