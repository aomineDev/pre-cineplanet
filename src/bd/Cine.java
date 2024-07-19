package bd;

import java.time.LocalTime;
import java.util.ArrayList;

import modelo.Horario;
import modelo.Movie;
import modelo.User;

public class Cine {
    
    //atributos
    private static Cine instace;
    private ArrayList<User> userList;
    private ArrayList<Movie>movielist;
    private ArrayList<Horario> horarioList;

    
    //metodo constructor vacio
    private Cine() {

        userList = new ArrayList<>();
        movielist = new ArrayList<>();
        horarioList = new ArrayList<>();

        // Añadiendo usuarios a ArrayList 
        userList.add(new User("Manuel", "145"));
        userList.add(new User("Mirella", "234"));
        userList.add(new User("Leo", "566"));
        userList.add(new User("Kaory", "345"));
        userList.add(new User("Roxi", "1070"));
        
        //Creando Horarios 
        horarioList.add(new Horario(LocalTime.of(16, 30), 1));
 

        //Añadiendo peliculas a Arraylist
        movielist.add(new Movie("Intensamente 2"));
        movielist.add(new Movie("BAD BOYS"));
        movielist.add(new Movie("Deadpool"));
    }

    //singleton
    public static Cine getInstace() {
        
        if (instace == null) {

            instace = new Cine();

        }
        
        return instace;
    }

    public ArrayList<User> getUserList() {
        return userList;
    }
    
    public ArrayList<Movie> getMovielist() {
        return movielist;
    }

}
