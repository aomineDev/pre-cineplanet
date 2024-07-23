package utp.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import utp.controller.LoginController;
import utp.model.User;

public class LoginView {
    
    @FXML
    private TextField TFusername;

    @FXML
    private PasswordField PFpassword;

    //atributos
    LoginController loginController;

    @FXML
    void open(ActionEvent event) {

        loginController = new LoginController();

        try {
            
            String username = TFusername.getText();
            String password = PFpassword.getText();

            User user = loginController.verifyUsername(username);
            Boolean verifyPassword = loginController.verifyPassword(user, password);

            if(verifyPassword) {

                System.out.println("BIENVENIDO");

            }

        } catch (Exception e) {

            System.out.println("CREDENCIALES INCORRECTAS");
        }

    }
}