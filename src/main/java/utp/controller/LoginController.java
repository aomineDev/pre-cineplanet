package utp.controller;

import java.util.ArrayList;

import utp.database.CineplanetDB;
import utp.model.User;
import utp.store.Store;

public class LoginController {

    //llamada (Instancia unica)
    private CineplanetDB cineplanetDB;
    private ArrayList<User> userList;
    private Store store;

    //constructor vacio
    public LoginController () {

        cineplanetDB = CineplanetDB.getInstance();
        userList = cineplanetDB.getUserList();
        store = Store.getInstance();

    }

    //verificacion del usurname
    public User verifyUsername(String username) {
        for (User user : userList) {

            if (username.equals(user.getUsername())) {
                return user;
            }
            
        }
        return null;
    }

    //validacion del password del usuario encontrado
    public boolean verifyPassword(User user, String password) {
     
        return password.equals(user.getPassword());
    }

    public void setStoreUser(User user) {

        store.setUser(user);

    }
}
