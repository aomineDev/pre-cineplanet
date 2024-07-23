package utp.database;

import java.util.ArrayList;

import utp.model.User;

public class CineplaentDB {
//atributos
    private static CineplaentDB instance;
    private ArrayList<User> userlList;

    //metodo construtor 
  private CineplaentDB () {
    ArrayList<User> userList = new ArrayList<User>();
    userList.add(new User("Keyla", "1234"));
    userList.add(new User("Roxana", "10701"));
    userList.add(new User("Calixto", "5678"));
    userList.add(new User("Omar", "9876"));
    userList.add(new User("Manuel", "6543"));
  }
  
  public static CineplaentDB getInstance() {
    if (instance == null) {
        instance = new CineplaentDB();
    }
    return instance;
  }

public ArrayList<User> getUserlList() {
    return userlList;
}
  

}
