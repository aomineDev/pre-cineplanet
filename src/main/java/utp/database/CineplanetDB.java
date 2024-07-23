package utp.database;

import java.util.ArrayList;

import utp.model.User;

public class CineplanetDB {

  //atributos
  private static CineplanetDB instance;
  private ArrayList<User> userList;

  //metodo construtor 
  private CineplanetDB () {

    userList = new ArrayList<>();

    userList.add(new User("Keyla", "1234"));
    userList.add(new User("Roxana", "10701"));
    userList.add(new User("Calixto", "123"));
    userList.add(new User("Omar", "9876"));
    userList.add(new User("Manuel", "6543"));

  }
  
  //patron de diseño singleton
  public static CineplanetDB getInstance() {
    if (instance == null) {
        instance = new CineplanetDB();
    }
    return instance;
  }

  //metodo para obtener lista de usuarios
  public ArrayList<User> getUserList() {
      return userList;
  }

}
