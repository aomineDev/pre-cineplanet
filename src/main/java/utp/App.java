package utp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
*/
public class App extends Application {

    private static Scene scene;
    private static Parent root;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("loginView"));
        scene.getStylesheets().add(getClass().getResource("css/styles.css").toExternalForm());
        stage.setTitle("Cineplanet");
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("fxml/" + fxml + ".fxml"));
        root = fxmlLoader.load();
        return root;
    }

    public static Parent getRoot() {
        return root;
    }

    public static void main(String[] args) {
        launch();
    }


}
