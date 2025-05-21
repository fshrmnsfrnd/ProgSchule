/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;

/**
 * FXML Controller class
 *
 * @author n.natzer
 */
public class BinearbaumController implements Initializable {

    @FXML
    private AnchorPane display;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void drawBaum(double startX, double startY){
        Line newLine = new Line();
        newLine.setStartX(0);
        newLine.setStartY(0);
        newLine.setEndX(10);
        newLine.setEndY(10);
        display.getChildren().add(newLine);
    }

    @FXML
    private void handlerDrawBaum(MouseEvent event) {
        drawBaum(0, display.getWidth() / 2);
    }
    
}
