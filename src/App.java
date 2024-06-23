import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ArrayList<String[]> userList = new ArrayList<>();

        String[] user1 = { "Jhordan", "123" };
        String[] user2 = { "Manuel", "145" };
        String[] user3 = { "Mirella", "12" };
        String[] user4 = { "Roxi", "14" };

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        System.out.println(userList.size());
        for (String[] user : userList) {

            System.out.println(user[0]);
            
        }

        // crear varible y poner valor

        String password, username;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Usuario");
        username = sc.next();
        System.out.println("Ingrese contraseña");
        password = sc.next();

        // Validación del username
        boolean userExist = false;
        String []user=new String[2];

        for (String[] u: userList) {

            if (username.equals(u[0])) {

                userExist = true;
                user = u; //user almacena el usuario encontrado (solo 1) a los elementos de u de arrays string
            }
        }

        if (userExist) {
            System.out.println("El usuario existe");

        //Validar contraseña 
        if ( password.equals(user[1])){
            System.out.println("BIENVENIDO");
        }else{
            System.out.println("La contraseña no valido");
        }

        } else {
            System.out.println("El usuario no existe");
        }

        
        

    }
}
