package utp.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import utp.controller.SeatController;
import utp.model.Seat;

public class SeatView {

    @FXML
    private FlowPane fpSeatContainer; 

    @FXML
    private Text tRoomNumber;

    @FXML
    private Text tSelectedSeats;

    private SeatController seatController;
    private Seat seat;
    @FXML
    public void initialize (){

        seatController = new SeatController();
        seat = seatController.getSeat();
        String [][] seatMatrix =seat.getSeatMatrix();
        tRoomNumber.setText("Sala N° "+seat.getRoomNumber());

        for ( int i=0; i<seatMatrix.length; i++){
            for ( int j=0; j<seatMatrix[i].length; j++){
                
                Button button =new Button();
                button.getStyleClass().add("seat");
                fpSeatContainer.getChildren().add(button);
                if (seatMatrix[i][j] .equals("V")){
                    button.getStyleClass().add("seat-void");
                 }else if (seatMatrix[i][j] .equals("L")){
                    button.getStyleClass().add("seat-empty"); 
                    button.setUserData(seatController.getSeatPoss(i, j));  
                    button.setOnAction((ActionEvent event )-> {
                    handleSeatClick(event);

                    });
                    // System.out.print(" - " + SeatController.getPosicionButaca(i, j)  );
 
                 }
             else if (seatMatrix[i][j] .equals("O")){
                button.getStyleClass().add("seat-occupied");
             }

            }
        }

    }
    public void handleSeatClick(ActionEvent event){
    Button button =(Button) event.getSource();
    String seatPoss= (String) button.getUserData();
    System.out.println(seatPoss);
    
    if(button.getStyleClass().contains("seat-empty")){
       button.getStyleClass().remove("seat-empty");
       button.getStyleClass().add("seat-selected");
       seatController.addSelectedSeats(seatPoss);
    }else{
        button.getStyleClass().add ("seat-empty");
       button.getStyleClass().remove("seat-selected");
       seatController.deleteSelectedSeats(seatPoss);
    }
    //mostrar asientos seleccionados 
    tSelectedSeats.setText(seatController.getSelectedSeatsToString());
}
    @FXML
    public void handleContineClick(ActionEvent event){
        System.out.println("Hello");  
    }


}
