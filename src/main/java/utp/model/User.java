package utp.model;

public class User {
    
    // atributos 
    private String user; 
    private String pasword; 

    //metodo constructor 

    public User (String user, String pasword){
        this.user = user;
        this.pasword = pasword;
    }

    //metodo get

    public String getUser(){
        return this.user;
    }
    public String getPasword(){
        return this.pasword;
    }
}
