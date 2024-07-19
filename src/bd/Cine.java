package bd;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import modelo.Fecha;
import modelo.Formato;
import modelo.Horario;
import modelo.Movie;
import modelo.User;

public class Cine {
    
    //atributos
    private static Cine instace;
    private ArrayList<User> userList;
    private ArrayList<Movie>movielist;
    private ArrayList<Horario> horarioList;
    private ArrayList<Fecha> fechaList;
    private ArrayList<Formato> formatoList;

    
    //metodo constructor vacio
    private Cine() {

        userList = new ArrayList<>();
        movielist = new ArrayList<>();


        horarioList = new ArrayList<>();
        fechaList = new ArrayList<>();
        formatoList = new ArrayList<>();

        // Añadiendo usuarios a ArrayList 
        userList.add(new User("Manuel", "145"));
        userList.add(new User("Mirella", "234"));
        userList.add(new User("Leo", "566"));
        userList.add(new User("Kaory", "345"));
        userList.add(new User("Roxi", "1070"));
        
        //Creando Horarios 1 
        horarioList.add(new Horario(LocalTime.of(16, 30), 1)); 

        //creando fechas 1
        fechaList.add(new Fecha(LocalDate.of(2024, 07, 19), horarioList));

        //creando formatos 1
        formatoList.add(new Formato("2D", fechaList));

        /* ---------------------------------------------------------------------------------- */

        //Creando horarios 2
        horarioList.clear();
        horarioList.add(new Horario(LocalTime.of(17, 20), 2));

        //creando fecha 2
        fechaList.clear();
        fechaList.add(new Fecha(LocalDate.of(2024, 07, 20), horarioList));

        //creando formato 2
        formatoList.add(new Formato("3D", fechaList));

        //Añadiendo peliculas a Arraylist
        movielist.add(new Movie("Intensamente 2", formatoList));
        movielist.add(new Movie("BAD BOYS", formatoList));
        movielist.add(new Movie("Deadpool", formatoList));
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
