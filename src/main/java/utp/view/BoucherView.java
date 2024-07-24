package utp.view;

import java.io.IOException;

import utp.App;
import utp.controller.BoucherController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;

public class BoucherView {
  @FXML
  private Text tTicketPrice;

  @FXML
  private Text tClient;

  @FXML
  private Text tDate;

  @FXML
  private Text tQuantity;

  @FXML
  private Text tRoomNumber;

  @FXML
  private Text tSelectedSeats;

  @FXML
  private Text tTime;

  @FXML
  private Text tTitle;

  @FXML
  private Text tFormat;

  @FXML
  private Text tTotalPrice;

  @FXML
  private TextField tfClient;

  private BoucherController boucherController;

  @FXML
  public void initialize() {
    boucherController = new BoucherController();
    
    tTitle.setText(boucherController.getStoreMovieTitle());
    tDate.setText(boucherController.getStoreDate());
    tTime.setText(boucherController.getStoreTime());
    tRoomNumber.setText(boucherController.getStoreRoomNumber());
    tSelectedSeats.setText(boucherController.getStoreSelectedSeats());
    tFormat.setText(boucherController.getStoreFormat());
    tQuantity.setText(boucherController.getStoreQunatity());
    tTicketPrice.setText(boucherController.getStoreticketPrice());
    tTotalPrice.setText(boucherController.getTotalPrice());
  }

  @FXML
  void handleGoBackBtnClick(ActionEvent event) throws IOException {
    App.setRoot("seatView");
  }

  @FXML
  void handleFinishClick(ActionEvent event) throws IOException {
    if (tfClient.getText().length() > 0) {
      boucherController.setOccupiedSeats();
      boucherController.createVoucher(tClient.getText());
      boucherController.saveAsPng(App.getRoot().lookup("#vbBoucher"), "Boucher");
      boucherController.saveAsPdf(App.getRoot().lookup("#vbBoucher"), "Boucher");
      
      App.setRoot("moviesView");
    }
  }

  @FXML
  void handleClientTyped(KeyEvent event) {
    tClient.setText(tfClient.getText());
  }
}