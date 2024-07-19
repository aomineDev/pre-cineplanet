package controlador;
import modelo.User;
import java.util.ArrayList;
import bd.Cine;

public class LoginContolador {

    // atributos
    private Cine cinedb;
    private ArrayList<User> userList;

    public LoginContolador() {

        cinedb = Cine.getInstace();
        userList = cinedb.getUserList();

    }

    public User ValidaUsername(String username) {

        // recorrer todos los usuarios
        for (User u: userList) {
            // buscar algun usuario de base de datos que sea igual al ingresado por teclado
            if (username.equals(u.getUsuario())) {
                //una vez ejecutado el return finaliza
                return u;
            }
        }

        return null;

    }

    public boolean ValidaPass(String password, User user) {

        return password.equals(user.getPasword());

    }
    
}
