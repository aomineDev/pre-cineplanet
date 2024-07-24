module utp {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.swing;


    requires transitive kernel;
    requires transitive layout;
    requires transitive io;

    opens utp to javafx.fxml;
    exports utp;
    opens utp.view to javafx.fxml;
    exports utp.view;
}
