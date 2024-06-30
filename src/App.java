// Crear la clase user - Roxana
// Modificar base de datos - Manuel
// Modificar la logica - Keyla
// Refactor de la aplicacion - Jhordam

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // BASE DE DATOS
		// arraylist de Usuarios
        ArrayList<User> userList = new ArrayList<>();
        
        
        // Añadiendo usuarios a ArrayList 

        userList.add(new User("Manuel", "145"));
        userList.add(new User("Mirella", "234"));
        userList.add(new User("Leo", "566"));
        userList.add(new User("Kaory", "345"));
        
		// imprimiendo tamaña de la lista de usuarios y todos los nombres de los usuarios
        
        for( User u1: userList  ){
            System.out.println(" Los usuarios es:  "+ u1.getUsuario() );
            
        }
	
        	// LOGIN
        // definiendo variables
        String password, username;
        Scanner sc = new Scanner(System.in);

		// obteniendo usuario y contraseña por teclado
        System.out.println("Ingrese Usuario");
        username = sc.next();
        System.out.println("Ingrese contraseña");
        password = sc.next();

        // Validación del nombre de usuario
        boolean userExist = false;
        String []user=new String[2];

		// recorrer todos los usuarios
        for (String[] u: userList) {
			// buscar algun usuario de base de datos que sea igual al ingresado por teclado
            if (username.equals(u[0])) {
                userExist = true;
                user = u; //user almacena el usuario encontrado
            }
        }

        if (userExist) {
            System.out.println("El usuario existe");

			//Validar contraseña 
			// comparando el password ingresado por teclado con el del usuario encontrado
			if ( password.equals(user[1])) {
				System.out.println("BIENVENIDO");
			} else {
				System.out.println("La contraseña no valido");
			}
        } else {
            System.out.println("El usuario no existe");
        }

		sc.close();
    }
}
