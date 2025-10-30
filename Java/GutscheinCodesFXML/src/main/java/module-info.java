module blogic.gutscheincodesfxml {
    requires javafx.controls;
    requires javafx.fxml;

    opens blogic.gutscheincodesfxml to javafx.fxml;
    exports blogic.gutscheincodesfxml;
}
