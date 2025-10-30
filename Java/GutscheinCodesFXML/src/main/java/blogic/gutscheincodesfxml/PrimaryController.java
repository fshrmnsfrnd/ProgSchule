package blogic.gutscheincodesfxml;

import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable{
    Random generator = new Random(); // Generator für Zufallszahlen
    @FXML
    private TextField inputTextField;
    @FXML
    private Label outputLabel;

    LinkedList<Integer> numbers = new LinkedList<>();
    
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @FXML
    private void checkIfInRange(ActionEvent event) throws IOException {
        while(numbers.size()<500001){
            numbers.add(generator.nextInt(500001));
        }
        if(numbers.contains(Integer.parseInt(inputTextField.getText()))){
            outputLabel.setText("Ist enthalten");
        }else{
            outputLabel.setText("Ist nicht enthalten");
        }
    }

   
}
