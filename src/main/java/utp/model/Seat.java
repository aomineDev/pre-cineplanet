package utp.model;

public class Seat {
    private int seatId;
    private int roomNumber;
    private String[][] seatMatrix=  {
      {"V", "L", "L", "L", "L", "L", "V", "V", "V", "V", "V", "V", "L", "L", "L", "L", "V", "V", "V"}, 
      {"V", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "V", "V", "V"}, 
      {"V", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "V", "V", "V"}, 
      {"V", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "V", "V", "V"}, 
      {"V", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L"}, 
      {"V", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L"}, 
      {"V", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L"}, 
      {"L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L", "L"}};
    
    public Seat(int seatId, int roomNumber) {
       this.seatId = seatId;
       this.roomNumber = roomNumber;
    }
 
    public int getSeatId() {
       return this.seatId;
    }
 
    public int getRoomNumber() {
       return this.roomNumber;
    }
 
    public String[][] getSeatMatrix() {
       return this.seatMatrix;
    }
 
    public void updateSeatStatus(int row, int column) {
       this.seatMatrix[row][column] = "O";
    }
}
