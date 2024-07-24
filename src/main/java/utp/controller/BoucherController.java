package utp.controller;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;

import javafx.scene.Node;
import javafx.scene.image.WritableImage;
import javafx.embed.swing.SwingFXUtils;
import javax.imageio.ImageIO;

import utp.database.CineplanetDB;
import utp.model.Seat;
import utp.model.Boucher;
import utp.store.Store;

public class BoucherController {
  private Store store;
  private CineplanetDB cineplanetDB; 
  private ArrayList<String> selectedSeats;

  public BoucherController() {
    store = Store.getInstance();
    cineplanetDB = CineplanetDB.getInstance();
    selectedSeats = store.getSelectedSeats();
  }

  public String getStoreSelectedSeats() {
    String str = selectedSeats.toString();

    return str.substring(1, str.length()-1);
  }

  public String getStoreMovieTitle() {
    return store.getMovie().getTitle();
  }

  public String getStoreDate() {
    return store.getDate();
  }

  public String getStoreTime() {
    return store.getTime().getFormattedTime();
  }

  public String getStoreRoomNumber() {
    return "sala " + store.getSeat().getRoomNumber();
  }

  public String getStoreFormat() {
    return store.getFormat() + " General";
  }

  public String getStoreQunatity() {
    return selectedSeats.size() + "";
  }

  public String getStoreticketPrice() {
    double ticketPrice = store.getTicketPrice();
    return store.getMovie().getFormattedTicketPrice(ticketPrice);
  }

  public String getTotalPrice() {
    double totalPrice =  store.getTicketPrice() * selectedSeats.size();

    return store.getMovie().getFormattedTicketPrice(totalPrice);
  }

  public int getSelectedSeatRowIndex(String seatPos) {
    char rowChar = seatPos.charAt(0);
    int row = 0;

    if (rowChar == 'A') row = 0;
    else if (rowChar == 'B') row = 1;
    else if (rowChar == 'C') row = 2;
    else if (rowChar == 'D') row = 3;
    else if (rowChar == 'E') row = 4;
    else if (rowChar == 'F') row = 5;
    else if (rowChar == 'G') row = 5;
    else if (rowChar == 'H') row = 7;

    return row;
  }

  public int getSelectedSeatColumnIndex(String seatPos) {
    return Integer.parseInt(seatPos.substring(1)) - 1;
  }

  public void setOccupiedSeats() {
    Seat seat = store.getSeat();

    for (String seatPos: selectedSeats) {
      int rowIndex = getSelectedSeatRowIndex(seatPos);
      int columnIndex = getSelectedSeatColumnIndex(seatPos);
      
      seat.updateSeatStatus(rowIndex, columnIndex);
    }

    selectedSeats.clear();
  }

  public void createVoucher(String clientName) {
    cineplanetDB.getBoucherList().add(new Boucher(
      clientName,
      getStoreMovieTitle(), 
      getStoreFormat(), 
      getStoreDate(), 
      getStoreTime(), 
      selectedSeats, 
      store.getTicketPrice(), 
      store.getSeat().getRoomNumber()
    ));
  }

  private WritableImage captureView(Node view) {
    WritableImage image = new WritableImage((int) view.getBoundsInParent().getWidth(), (int) view.getBoundsInParent().getHeight());
    view.snapshot(null, image);

    return image;
  }

  public void saveAsPng(Node view, String filePath) throws IOException {
    WritableImage image = captureView(view);
    File file = new File(filePath + ".png");
    ImageIO.write(SwingFXUtils.fromFXImage(image, null), "png", file);
  }

  public void saveAsPdf(Node view, String filePath) throws IOException {
    WritableImage image = captureView(view);
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    ImageIO.write(SwingFXUtils.fromFXImage(image, null), "png", outputStream);
    byte[] imageBytes = outputStream.toByteArray();

    ImageData data = ImageDataFactory.create(imageBytes);
    Image pdfImage = new Image(data);

    PdfWriter writer = new PdfWriter(filePath + ".pdf");
    PdfDocument pdfDoc = new PdfDocument(writer);
    Document document = new Document(pdfDoc);

    document.add(pdfImage);
    document.close();
  }
  
}
