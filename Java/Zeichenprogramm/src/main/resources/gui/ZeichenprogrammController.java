/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gui;

import static java.lang.Math.abs;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
/**
 * FXML Controller class
 *
 * @author n.natzer
 */
public class ZeichenprogrammController{

    @FXML
    private RadioButton radBtnKreis;
    @FXML
    private ToggleGroup form;
    @FXML
    private RadioButton radBtnRechteck;
    @FXML
    private RadioButton radBtnLinie;
    @FXML
    private Button delete;
    @FXML
    private AnchorPane drawPane;
    /**
     * Initializes the controller class.
     */
    
    double xCordPress;
    double yCordPress;
    
    private void drawKreis(double xStart, double yStart, double xEnd, double yEnd) {
        double radius = Math.sqrt(Math.pow((xEnd - xStart), 2) + Math.pow((yEnd - yStart), 2));
        
        Circle newCircle = new Circle();
        newCircle.setCenterX(xStart);
        newCircle.setCenterY(yStart);
        newCircle.setRadius(radius);
        
        drawPane.getChildren().add(newCircle);
    }
    
    private void drawRechteck(double xStart, double yStart, double xEnd, double yEnd) {
        double height = yEnd - yStart;
        double width = xEnd - xStart;
        
        if(height < 0){
            yStart = yEnd;
            height = abs(height);
        }
        
        if(width < 0){
            xStart = xEnd;
            width = abs(width);
        }
        
        Rectangle newRectangle = new Rectangle();
        newRectangle.setX(xStart);
        newRectangle.setY(yStart);
        newRectangle.setHeight(height);
        newRectangle.setWidth(width);
        
        drawPane.getChildren().add(newRectangle);
    }
    
    private void drawLinie(double xStart, double yStart, double xEnd, double yEnd) {
        Line newLine = new Line();
        newLine.setStartX(xStart);
        newLine.setStartY(yStart);
        newLine.setEndX(xEnd);
        newLine.setEndY(yEnd);
        
        drawPane.getChildren().add(newLine);
    }
    
    @FXML
    private void emptyDrawPane(ActionEvent event) {
        drawPane.getChildren().clear();
    }
    
     @FXML
    private void drawPanePressed(MouseEvent event) {
        xCordPress = event.getX();
        yCordPress = event.getY();
    }

    @FXML
    private void drawPaneReleased(MouseEvent event) {
        double xCordRelease = event.getX();
        double yCordRelease = event.getY();
        
        double maxX = drawPane.getWidth();
        double maxY = drawPane.getHeight();
        
        if(xCordRelease >= 0 && xCordRelease <= maxX && yCordRelease >= 0 && yCordRelease <= maxY){
            if(radBtnKreis.isSelected()){
                drawKreis(xCordPress, yCordPress, xCordRelease, yCordRelease);
            }else if(radBtnRechteck.isSelected()){
                drawRechteck(xCordPress, yCordPress, xCordRelease, yCordRelease);
            }else if(radBtnLinie.isSelected()){
                drawLinie(xCordPress, yCordPress, xCordRelease, yCordRelease);
            }
        }
    }

   
}
