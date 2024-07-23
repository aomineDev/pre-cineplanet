package utp.controller;

import java.util.ArrayList;

import utp.database.CineplanetDB;
import utp.model.User;

public class LoginController {

    //llamada (Instancia unica)
    CineplanetDB cineplanetDB;
    ArrayList<User> userList;

    //constructor vacio
    public LoginController () {

        cineplanetDB = CineplanetDB.getInstance();
        userList = cineplanetDB.getUserList();

    }

    public User verifyUsername(String username) {

        for (User user : userList) {

            if (username.equals(user.getUsername())) {

                return user;

            }

        }

        return null;

    }

    public boolean verifyPassword(User user, String password) {
        
        return password.equals(user.getPassword());

    }
    
}
