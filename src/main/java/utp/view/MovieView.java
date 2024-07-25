package utp.view;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import utp.App;
import utp.controller.MovieController;
import utp.model.Date;
import utp.model.Format;
import utp.model.Movie;
import utp.model.Time;

public class MovieView {

    @FXML
    private HBox hbDateBtnBox;

    @FXML
    private HBox hbFormatBtnBox;

    @FXML
    private HBox hbTimeBtnBox;

    @FXML
    private Text tTicket;

    @FXML
    private Text tDuracion;

    @FXML
    private Text tGenero;

    @FXML
    private Text tTitle;

    @FXML
    private ImageView ivCover;

    private MovieController movieController;
    private Movie movie;
    private ArrayList<Format> formatList;
    private ArrayList<Date> dateList;
    private ArrayList<Time> timeList;

    @FXML
    public void initialize() {

        movieController = new MovieController();
        movie = movieController.getStoreMovie();
        
        Image image = new Image(getClass().getResource("/utp/images/movies/3x-" + movie.getCover()).toExternalForm());
        ivCover.setImage(image);

        //parte visual elementos
        tTitle.setText(movie.getTitle() + " - " + movie.getCategory());
        tGenero.setText(movie.getGender());
        tDuracion.setText(movie.getFormattedDuration());
        
        //guardar la lista de formatos de la base de datos
        formatList = movie.getFormatList();
        //muestra los formatos en base al metodo creado
        renderFormatBtnList(formatList);

        tTicket.setText(movie.getFormattedTicketPrice(formatList.get(0).getTicketPrice()));

        //guardar la lista de fechas del formato con indice 0
        dateList = formatList.get(0).getDateList();
        //muestra las fechas en base al metodo creado
        renderDateBtnList(dateList);

        //guardar la lista de horarios del formato con indice 0
        timeList = dateList.get(0).getTimeList();
        //muestra los horarios
        renderTimeBtnList(timeList);

    }

    /* ---------------------------- METODOS QUE CREAN LOS BOTONES -------------------------- */

    //mostrar los formatos por pantalla
    void renderFormatBtnList(ArrayList<Format> formatList) {

        for (Format format : formatList) {

            Button button = new Button(format.getFormat());
            button.setUserData(format);

            //estilos
            button.getStyleClass().add("btn-format");

            button.setOnAction((ActionEvent event)->{
                handleFormatClick(event);
            });

            hbFormatBtnBox.getChildren().add(button);

        }

        addActiveClass(hbFormatBtnBox);

        movieController.setFormat(formatList.get(0).getFormat());
        movieController.setTicket(formatList.get(0).getTicketPrice());

    }

    //mostrar las fechas por pantalla
    void renderDateBtnList(ArrayList<Date> dateList) {

        //limpia el contenedor
        hbDateBtnBox.getChildren().clear();

        for (Date date : dateList) {

            Button button = new Button(date.getFormattedDate());
            button.setUserData(date);

            //añadiendo estilos
            button.getStyleClass().add("btn-date-time");

            button.setOnAction((ActionEvent event)->{
                handleDateClick(event);
            } );

            hbDateBtnBox.getChildren().add(button);
        }

        addActiveClass(hbDateBtnBox);

        movieController.setDate(dateList.get(0).getFormattedDate());

    }

    void renderTimeBtnList(ArrayList<Time> timeList) {

        //limpia el contendor
        hbTimeBtnBox.getChildren().clear();

        for (Time time : timeList) {

            Button button = new Button(time.getFormattedTime());
            button.setUserData(time);

            //añadiendo estilos
            button.getStyleClass().add("btn-date-time");

            button.setOnAction((ActionEvent event) -> {
                handleTimeClick(event);
            });

            hbTimeBtnBox.getChildren().add(button);

        }

        addActiveClass(hbTimeBtnBox);

        movieController.setTime(timeList.get(0));

    }

    /* ---------------------------- METODOS QUE SE EJECUTAN AL HACER CLICK -------------------------- */

    //guardar el formato en el store
    void handleFormatClick(ActionEvent event) {

        Button button = (Button) event.getSource();
        Format format = (Format) button.getUserData();

        deleteActiveClass(hbFormatBtnBox);
        button.getStyleClass().add("active");

        //obtiene los elementos de ese formato
        dateList = format.getDateList();

        renderDateBtnList(dateList);
        renderTimeBtnList(dateList.get(0).getTimeList());

        tTicket.setText(movie.getFormattedTicketPrice(format.getTicketPrice()));

        //enviando formato al controlador
        movieController.setFormat(format.getFormat());
        movieController.setTicket(format.getTicketPrice());

    }

    void handleDateClick(ActionEvent event) {

        Button button = (Button) event.getSource();
        Date date = (Date) button.getUserData();

        button.getStyleClass().add("active");

        //obtiene los elementos de esa fecha
        timeList = date.getTimeList();

        renderTimeBtnList(timeList);

        //enviando fecha al controlador
        movieController.setDate(date.getFormattedDate());

    }

    void handleTimeClick(ActionEvent event) {

        Button button = (Button) event.getSource();
        Time time = (Time) button.getUserData();

        button.getStyleClass().add("active");

        //enviar
        movieController.setTime(time);

    }

    void deleteActiveClass(HBox hbox) {

        hbox.getChildren().forEach(button -> {
            button.getStyleClass().remove("active");
        });

    }

    void addActiveClass(HBox hbox) {

        hbox.getChildren().get(0).getStyleClass().add("active");

    }

    @FXML
    void handleContinueButton(ActionEvent event) throws IOException {
        
        App.setRoot("seatView");

    }

}
