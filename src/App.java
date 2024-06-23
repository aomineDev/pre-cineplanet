import java.util.ArrayList;
import java.util.Scanner;

public class App {
 public static void main(String[] args) {

    ArrayList<String[]> userList = new ArrayList<>();

    String[] user1 = {"Jhordan","123"};
    String[] user2 = {"Manuel","145"};
    String[] user3 = {"Mirella","12"};

    userList.add(user1);
    userList.add(user2);
    userList.add(user3);

    //crear varible y poner valor 

    String password, user;

    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese Usuario");
    user =sc.next();
    System.out.println("Ingrese contraseña");
    password=sc.next();

    System.out.println("La contrasaña es "+password);
    System.out.println("El usuario es "+user );

 }
}
