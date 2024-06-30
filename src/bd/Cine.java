package bd;

import java.util.ArrayList;

import modelo.User;

public class Cine {

    private ArrayList<User> userList;
        
    public Cine() {

        userList = new ArrayList<>();

        // Añadiendo usuarios a ArrayList 
        userList.add(new User("Manuel", "145"));
        userList.add(new User("Mirella", "234"));
        userList.add(new User("Leo", "566"));
        userList.add(new User("Kaory", "345"));
        userList.add(new User("Roxi", "1070"));

    }

    public ArrayList<User> getUserList() {
        return userList;
    }

}
