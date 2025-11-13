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

    @FXML
    private void handlerDrawBaum(MouseEvent event) {
        drawBaum(display.getWidth() / 2, 1);
    }

    private void drawBaum(double startX, double startY) {
        double endXLeft = startX - 100;
        double endXRight = startX + 100;
        double endY = startY + 100;
        
        System.out.println("EndXLeft: " + endXLeft + " endXRight: " + endXRight + " Width: " + display.getWidth());
        System.out.println("endY: " + endY + " Height: " + display.getHeight());
        
        if(endY <= display.getHeight() && endXLeft >= 0 && endXRight <= display.getWidth()){
            System.out.println("Here");
            Line newLineLeft = new Line();
            newLineLeft.setStartX(startX);
            newLineLeft.setStartY(startY);
            newLineLeft.setEndX(endXLeft);
            newLineLeft.setEndY(endY);
            display.getChildren().add(newLineLeft);
            
            Line newLineRight = new Line();
            newLineRight.setStartX(startX);
            newLineRight.setStartY(startY);
            newLineRight.setEndX(endXRight);
            newLineRight.setEndY(endY);
            display.getChildren().add(newLineRight);
            
            drawBaum(endXRight, endY);
            drawBaum(endXLeft, endY);
        }
        
        
    }
    
}
