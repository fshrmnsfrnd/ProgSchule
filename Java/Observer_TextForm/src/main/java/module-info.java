module com.example.observer_textform {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.observer_textform to javafx.fxml;
    exports com.example.observer_textform;
}