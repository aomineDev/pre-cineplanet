module utp {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens utp to javafx.fxml;
    exports utp;
    opens utp.view to javafx.fxml;
    exports utp.view;
}
