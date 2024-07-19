package vista;

import java.util.Scanner;

import controlador.LoginContolador;
import modelo.User;
import tienda.Tienda;

public class LoginVista {
    
    public static void main(String[] args) {
        
        LoginContolador lg = new LoginContolador();
        Tienda tienda = Tienda.getInstance();

        // definiendo variables
        String password, username;
        Scanner sc = new Scanner(System.in);

		// obteniendo usuario y contraseña por teclado
        System.out.println("Ingrese Usuario");
        username = sc.next();
        System.out.println("Ingrese contraseña");
        password = sc.next();
        
        User user = lg.ValidaUsername(username);

        if (user != null) {

			// Validar contraseña 
			// comparando el password ingresado por teclado con el del usuario encontrado
            boolean passVerify = lg.ValidaPass(password, user);
            tienda.setUser(user);

			if ( passVerify) {

				MovieVista.main(args);

			} else {
				System.out.println("La contraseña no valida");
			}
        } else {
            System.out.println("El usuario no existe");
        }

		sc.close();

    }

}
