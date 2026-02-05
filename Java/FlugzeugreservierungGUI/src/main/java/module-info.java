module com.example.flugzeugreservierunggui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.flugzeugreservierunggui to javafx.fxml;
    exports com.example.flugzeugreservierunggui;
}