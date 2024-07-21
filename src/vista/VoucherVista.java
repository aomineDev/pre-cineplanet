package vista;

import controlador.VoucherControlador;

public class VoucherVista {

    public static void main(String[] args) {

        VoucherControlador voucher = new VoucherControlador();

        System.out.println("VOUCHER");
        System.out.println("Pelicula seleccionada " + voucher.getMovie().getTitulo());
        voucher.setButacasOcupadas();
        ButacaFinalVista.main(args);




    }
    
    
}
