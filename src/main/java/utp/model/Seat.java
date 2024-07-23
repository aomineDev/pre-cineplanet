package utp.model;

public class Seat {
    private int seatId;
    private int roomNumber;
    private String[][] seats = new String[][]{
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
 
    public String[][] getSeats() {
       return this.seats;
    }
 
    public void updateSeatStatus(int row, int column) {
       this.seats[row][column] = "O";
    }
}
