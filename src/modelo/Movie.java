package modelo;

public class Movie {
    
    //atributos 

    private String titulo;
    //constructor 
    public Movie (String titulo){
        this.titulo= titulo;
    }
    //metodo get y set
        public String getTitulo() {
            return titulo;
        }
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
}
