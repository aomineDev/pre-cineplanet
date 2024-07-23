package utp.database;

public class CineplaentDB {

    private static CineplaentDB instance;

  private CineplaentDB () {

  }
  public static CineplaentDB getInstance() {
    if (instance == null) {
        instance = new CineplaentDB();
    }
    return instance;
  }
  

}
