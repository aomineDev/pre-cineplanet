package utp.controller;

import java.util.ArrayList;

import utp.database.CineplanetDB;
import utp.model.Seat;
import utp.store.Store;

public class SeatController {
    
    private ArrayList <Seat> seatList;
    private Store store;
    private ArrayList<String> selectedSeats;
    

    //constructor vacio 
    public SeatController(){

        seatList = CineplanetDB.getInstance().getSeatList();
        store = Store.getInstance();
        selectedSeats= store.getSelectedSeats();

    }

    public Seat getSeat(){

        int id = store.getTime().getSeatId();

        for (Seat st : seatList){
            if( id == st.getSeatId()){
                return st;
            }
        }
        
        return null;
    }

    public String getSeatPoss(int row, int column){ 
        
        String rowStr="";

        if (row == 0){

            rowStr= "A";

        }else if (row == 1){

            rowStr= "B";

        }else if (row == 2){

            rowStr= "C";

        }else if (row == 3){

            rowStr= "D";

        }else if (row == 4){

            rowStr= "E";

        }else if (row == 5){

            rowStr= "F";
            
        }else if (row == 6){

            rowStr= "G";

        }else if (row == 7){

            rowStr= "H";

        } 
    return rowStr+(column+1);

    }

    public ArrayList<String> getSelectedSeats() {

        return selectedSeats;

    }

    //añadir seleccion de butacas
    public void addSelectedSeats(String seatPoss) {

        selectedSeats.add(seatPoss);

    }

    public void deleteSelectedSeats(String seatPoss) {

        int index = selectedSeats.indexOf(seatPoss);

        selectedSeats.remove(index);

    }

    public String getSelectedSeatsToString() {

        String str = selectedSeats.toString();

        //return str.substring(1, str.length()-1);

        return str.replace("[", "").replace("]", "");
    }

}





