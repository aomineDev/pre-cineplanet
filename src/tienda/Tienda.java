package tienda;

import modelo.User;

public class Tienda {

    //atributos
    private static Tienda instance;
    User user;

    private Tienda () {

    }

    //singleton
    public static Tienda getInstance() {
        
        if (instance == null) {
            instance = new Tienda();
        }
        
        return instance;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
    
}
