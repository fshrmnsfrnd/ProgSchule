module gui.fxml_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens gui.fxml_project to javafx.fxml;
    exports gui.fxml_project;
}
