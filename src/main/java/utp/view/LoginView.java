package utp.view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;
import utp.App;
import utp.controller.LoginController;
import utp.model.User;

public class LoginView {
    
    @FXML
    private TextField TFusername;
    
    @FXML
    private Text tInvalidUser;

    @FXML
    private PasswordField PFpassword;

    @FXML
    private Text tInvalidPassword;

    //atributos
    private LoginController loginController;

    @FXML
    public void initialize(){
        loginController= new LoginController();
    }


    @FXML
    void open(ActionEvent event) throws IOException {
        String username = TFusername.getText();
        String password = PFpassword.getText();
        

        User user = loginController.verifyUsername(username);

        if (user == null) {

            handleIncorrectCredentials();
                
        }else{
            boolean isVerify = loginController.verifyPassword(user, password);
        if (isVerify) {

            loginController.setStoreUser(user);
            App.setRoot("moviesView");
           

        }else{
            handleIncorrectCredentials();
        }       

    }
} 
private void handleIncorrectCredentials(){
    
    tInvalidUser.setVisible(true);
    tInvalidPassword.setVisible(true);   
    TFusername.setText(null);
    PFpassword.setText(null);

} 

@FXML
    void HandleTyped(KeyEvent event) {
        tInvalidPassword.setVisible(false);
        tInvalidUser.setVisible(false);
    }
}