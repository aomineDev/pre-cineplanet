package utp.model;

public class User {
    
    // atributos 
    private String username; 
    private String password; 

    //metodo constructor 

    public User (String username, String password){
        this.user = username;
        this.pasword = password;
    }

    //metodo get

    public String getUser(){
        return this.username;
    }
    public String getPasword(){
        return this.password;
    }
}
