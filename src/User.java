public class User {
    //atributos
private String usuario;
private String pasword;

//metodo construtor
public User (String usuario , String pasword) {
    this.usuario = usuario;
    this.pasword = pasword;
}
public String getUsuario () {
return this.usuario;
}
public String getPasword (){
    return this.pasword;
}

}