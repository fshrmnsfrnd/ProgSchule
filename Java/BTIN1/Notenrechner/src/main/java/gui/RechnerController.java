/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
/**
 * FXML Controller class
 *
 * @author n.natzer
 */
public class RechnerController{
    @FXML
    private Spinner<Integer> currPointsField;
    @FXML
    private Spinner<Integer> maxPointsField;
    @FXML
    private TextField gradeField;
    @FXML
    private Button calculateBtn;
    
    @FXML
    private void triggerCalculateGrade(MouseEvent event){
        float max = maxPointsField.getValue();
        float curr = currPointsField.getValue();
        if(curr > max){
            currPointsField.getValueFactory().setValue((Integer) Math.round(max));
        }
        calculateBtn.fire();
    }
    
    @FXML
    private void calculateGrade(ActionEvent event) {
        float max = maxPointsField.getValue();
        float curr = currPointsField.getValue();
        
        if(max != 0 && curr != 0){
            float percent = curr  * 100 / max;
            int grade = 0;
        
            if(percent > 91){
                grade = 1;
            }else if(percent > 80){
                grade = 2;
            }else if(percent > 66){
                grade = 3;
            }else if(percent > 49){
                grade = 4;
            }else if(percent > 29){
                grade = 5;
            }else if(percent >= 0){
                grade = 6;
            }
        
            gradeField.setText(Integer.toString(grade));
        }
    }
}
