package utp.view;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import utp.App;
import utp.controller.MoviesController;
import utp.model.Movie;

public class MoviesView {
    @FXML
    private FlowPane fpMovies;

    @FXML
    private Text tUserName;
    private MoviesController moviesController;
    @FXML
    public void initialize() {
        
        moviesController = new MoviesController();

        tUserName.setText(moviesController.getStoreUser().getUsername());

        for(Movie movie: moviesController.getMovieList()) {
            Image image = new Image(getClass().getResource("/utp/images/movies/" + movie.getCover()).toString());
            ImageView imageView = new ImageView(image);
            imageView.setCursor(Cursor.HAND);

            //alamacena informacion de la pelicula 
            imageView.setUserData(movie);
            imageView.setOnMouseClicked((MouseEvent event)  -> handleImagenClick(event));
            fpMovies.getChildren().add(imageView);
        }
    }

    public void handleImagenClick(MouseEvent event){

        ImageView imagenView = (ImageView) event.getSource();
        Movie movie = (Movie) imagenView.getUserData();

        moviesController.setStoreMovie(movie);

        try {

            App.setRoot("movieView");
            
        } catch (IOException e) {

            System.out.println(e.getMessage());
        }

    }
}
