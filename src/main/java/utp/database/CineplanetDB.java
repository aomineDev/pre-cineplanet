package utp.database;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import utp.model.Date;
import utp.model.Format;
import utp.model.Movie;
import utp.model.Seat;
import utp.model.Time;
import utp.model.User;
import utp.model.Boucher;

public class CineplanetDB {

  //atributos
  private static CineplanetDB instance;
  private ArrayList<User> userList;
  private ArrayList<Movie> movieList;
  private ArrayList<Date> dateList; //Lista de fecha
  private ArrayList<Time> timeList; //Lista de horario
  private ArrayList<Format> formatList; //Lista de formato
  private ArrayList<Seat> seatList; // Lista de butacas
  private ArrayList<Boucher> boucherList; // Lista de boucher 

  //metodo construtor 
  private CineplanetDB () {

    userList = new ArrayList<>();

    //llenando lista de usuarios
    userList.add(new User("Keyla", "1234"));
    userList.add(new User("Roxana", "10701"));
    userList.add(new User("Calixto", "123"));
    userList.add(new User("Omar", "9876"));
    userList.add(new User("Manuel", "6543"));

    /* --------------------------------------------------------------------------- */

    movieList = new ArrayList<>();
    dateList = new ArrayList<>();
    timeList = new ArrayList<>();
    formatList = new ArrayList<>();
    seatList = new ArrayList<>();
    boucherList = new ArrayList<>();

    // Horario 1
    timeList.add(new Time(LocalTime.of(18, 30), 1));
    seatList.add(new Seat(1, 1));

    //Fecha 1
    dateList.add(new Date(LocalDate.of(2024, 05, 17), timeList));

    //formato1
    formatList.add(new Format("2D", 12.00, dateList));

    //---------------------------------------------------------------------//

    //Horario 2
    timeList.clear();
    timeList.add(new Time(LocalTime.of(14, 40), 2));
    seatList.add(new Seat(2, 2));

    //fecha 2
    dateList.clear();
    dateList.add(new Date(LocalDate.of(2024, 07, 27), timeList));

    //formato 2
    formatList.add(new Format("3D",  17.00, dateList));

    //------------------------------------------------------------------------//
    //horario 3

    timeList.clear();
    timeList.add(new Time(LocalTime.of(16, 45), 3));
    seatList.add(new Seat(3, 3));

    //fecha 3
    dateList.clear();
    dateList.add(new Date(LocalDate.of(2023, 01, 12), timeList));

    //formato 3
    formatList.add(new Format("2D", 17.00, dateList));
    
    // llenando lista de peliculas
    movieList.add(new Movie("Amigos Imaginarios", "amigos-imaginarios.png", "Animacion", "A", false, LocalTime.of(1, 44),formatList));
    movieList.add(new Movie("Bay Boys", "bad-boys.png", "Accion", "16", false, LocalTime.of(2, 4), formatList));
    movieList.add(new Movie("Madam", "madam-web.png", "Accion", "12", false, LocalTime.of(1, 56), formatList));
    movieList.add(new Movie("Role-play", "role-play.png", "Accion", "R", false, LocalTime.of(1, 40), formatList));
  }
  
  //patron de diseño singleton
  public static CineplanetDB getInstance() {
    if (instance == null) {
        instance = new CineplanetDB();
    }
    return instance;
  }

  //metodo para obtener lista de usuarios
  public ArrayList<User> getUserList() {
      return userList;
  }

  //metodo para obtener lista de peliculas
  public ArrayList<Movie> getMovieList(){
    return movieList;
  }
  public ArrayList<Seat> getSeatList() {
      return seatList;
  }

  public ArrayList<Boucher> getBoucherList() {
    return boucherList;
  }

}
