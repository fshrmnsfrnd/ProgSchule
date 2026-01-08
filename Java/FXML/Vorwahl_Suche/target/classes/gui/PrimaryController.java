/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gui;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Nico
 */
public class PrimaryController {

    @FXML
    private TextField searchFieldTxt;
    @FXML
    private Button searchBtn;
    @FXML
    private TextArea outField;

    public boolean validateSearch(String txt){
        if(txt.length() >= 2){
            return true;
        }else{
            return false;
        }
    }
    
    private boolean checkTxtinLine(String searchTxt, String zeile) {
        if(zeile.contains(searchTxt)){
            return true;
        }else{
            return false;
        }
    }
    
    private String formatLine(String zeile) {
        String vorwahl = zeile.substring(0, 6);
        String ort = zeile.substring(6, zeile.length());
        
        return vorwahl + " " + ort;
    }
    
    @FXML
    private void handleSearchBtn(ActionEvent event) {
        String searchTxt = searchFieldTxt.getText();
        
        if(validateSearch(searchTxt)){
            try{
                Path pfad = Paths.get("./avon.txt");
                for (String zeile : Files.readAllLines(pfad)){
                    zeile = formatLine(zeile);
                    if(checkTxtinLine(searchTxt, zeile)){
                        outField.appendText(zeile + "\n");
                    }
                }
            }catch (IOException ex){
                System.err.println("Ein- oder Ausgabefehler: " + ex.getLocalizedMessage());
            }catch (InvalidPathException e){
                System.err.println("Ungültiger Pfad: " + e.getLocalizedMessage());
            }
        }
    }

    
}
