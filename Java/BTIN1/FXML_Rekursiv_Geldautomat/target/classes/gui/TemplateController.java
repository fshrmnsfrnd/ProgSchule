/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextArea;
/**
 * FXML Controller class
 *
 * @author n.natzer
 */
public class TemplateController implements Initializable {


    @FXML
    private Button auszahlenBtn;
    @FXML
    private TextArea display;
    @FXML
    private Spinner<Integer> wertSpn;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        wertSpn.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(5, 2000, 100, 5));
    }    
    
    @FXML
    private void handleAuszahlenClick(ActionEvent event) {
        display.setText("");
        auszahlen(wertSpn.getValue());
    }
    
    public void auszahlen(int betrag){
        int schein = 0;
        
        if(betrag >= 50){
            schein = 50;
        }else if(betrag >= 20){
            schein = 20;
        }else if(betrag >= 10){
            schein = 10;
        }else if(betrag >= 5){
            schein = 5;
        }
        String currText = display.getText();
        display.setText(currText + String.valueOf(schein) + " EUR \n");
        
        if(betrag > 0){
            auszahlen(betrag - schein);
        }
    }

}
