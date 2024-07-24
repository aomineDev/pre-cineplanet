package utp.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import utp.controller.MoviesController;
import utp.model.Movie;

public class MoviesView {
    @FXML
    private FlowPane fpMovies;

    @FXML
    private Text tUserName;
    private MoviesController moviesController;
    @FXML
    public void initialize(){
        moviesController = new MoviesController();
        tUserName.setText("Roxana");
        for(Movie movie: moviesController.getMovieList()) {
            Image image = new Image(getClass().getResource("/utp/images/movies/" + movie.getCover()).toString());
            ImageView imageView = new ImageView(image);
            imageView.setCursor(Cursor.HAND);
            //alamacena informacion de la pelicula 
            imageView.setUserData(movie);
            imageView.setOnMouseClicked((MouseEvent event) -> handleImagenClick(event));
            fpMovies.getChildren().add(imageView);
        }
    }
    public void handleImagenClick(MouseEvent event){
        ImageView imagenView = (ImageView) event.getSource();
        Movie movie = (Movie) imagenView.getUserData();

        System.out.println(movie.getTitle());
    }
}
