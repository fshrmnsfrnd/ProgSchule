module gui.test_jetbrains_fxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens gui.test_jetbrains_fxml to javafx.fxml;
    exports gui.test_jetbrains_fxml;
}