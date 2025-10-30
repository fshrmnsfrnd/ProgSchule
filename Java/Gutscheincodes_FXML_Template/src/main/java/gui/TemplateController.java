package gui;

import java.net.URL;
import java.util.LinkedList;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TemplateController implements Initializable{
    Random generator = new Random();
    LinkedList<Integer> numbers = new LinkedList<>();
    
    @FXML
    private TextField inputTextField;
    @FXML
    private Label outputLabel;
    
    private void setNumbers(){
        while(numbers.size()<500001){
            numbers.add(generator.nextInt(500001));
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        this.setNumbers();
    }
    
    @FXML
    public void handleButtonKlick(ActionEvent event){
        System.out.println("Button geklickt");
        
        if(numbers.contains(Integer.parseInt(inputTextField.getText()))){
            outputLabel.setText("Ist drin");
        }else{
            outputLabel.setText("Nicht drin");
        }
    }
}
