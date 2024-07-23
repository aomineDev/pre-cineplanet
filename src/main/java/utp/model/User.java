package utp.model;

public class User {
    
    // atributos 
    private String username; 
    private String password; 

    //metodo constructor 

    public User (String username, String password){
        this.username = username;
        this.password = password;
    }

    //metodo get

    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
}
