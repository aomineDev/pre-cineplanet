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

        System.out.println("La contrasaña es " + password);
        System.out.println("El usuario es " + username);

        // Validación del username
        boolean userExist = false;
    

        for (String[] user: userList) {

            if (username.equals(user[0])) {

                userExist = true;

            }
        }
        if (userExist) {

            System.out.println("El usuario existe");

        } else {
            System.out.println("El usuario no existe");
        }

    }
}
