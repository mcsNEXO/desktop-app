module com.example.realone {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.realone to javafx.fxml;
    exports com.example.realone;
}