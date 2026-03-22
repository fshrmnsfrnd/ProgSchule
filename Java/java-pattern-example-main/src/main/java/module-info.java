module co.boerg.prototype {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.boerg.prototype to javafx.fxml;
    exports co.boerg.prototype;
    exports co.boerg.prototype.product;
    opens co.boerg.prototype.product to javafx.fxml;
}