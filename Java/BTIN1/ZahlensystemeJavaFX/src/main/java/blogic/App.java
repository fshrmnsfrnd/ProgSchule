package blogic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
    
    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        
        //Radiobuttons als Gruppe
        ToggleGroup RBtns = new ToggleGroup();
        
        //Radiobuttons
        RadioButton decRB = new RadioButton("Dec");
        decRB.setUserData("dec");
        decRB.setToggleGroup(RBtns);
        
        RadioButton hexRB = new RadioButton("Hex");
        hexRB.setUserData("hex");
        hexRB.setToggleGroup(RBtns);
        
        RadioButton octRB = new RadioButton("Oct");
        octRB.setUserData("oct");
        octRB.setToggleGroup(RBtns);
        
        RadioButton binRB = new RadioButton("Bin");
        binRB.setUserData("bin");
        binRB.setToggleGroup(RBtns);
        
        //Radiobuttons in Horizontal Box
        HBox RBtnsBox = new HBox(decRB, hexRB, octRB, binRB);
        
        //Label und Textfeld für Eingabe
        Label decLabel = new Label("Dec: ");
        TextField decText = new TextField("0");
        HBox decInput = new HBox(decLabel, decText);
        
        Label hexLabel = new Label("Hex: ");
        TextField hexText = new TextField("0");
        HBox hexInput = new HBox(hexLabel, hexText);
        
        Label octLabel = new Label("Oct: ");
        TextField octText = new TextField("0");
        HBox octInput = new HBox(octLabel, octText);
        
        Label binLabel = new Label("Bin: ");
        TextField binText = new TextField("0");
        HBox binInput = new HBox(binLabel, binText);
        
        //Eingaben in Vertical Box
        VBox inputs = new VBox(decInput, hexInput, octInput, binInput);
        
        Button rechnen = new Button("Rechnen");
        Button deleteAll = new Button("Alles Loschen");
        
        HBox buttons = new HBox(rechnen, deleteAll);
        
        root.setTop(RBtnsBox);
        root.setCenter(inputs);
        root.setBottom(buttons);
        var scene = new Scene(root, 640, 480);
        
        stage.setTitle("DecHexBinOct");
        stage.setScene(scene);
        stage.show();
        
        //Eventhandler
        deleteAll.addEventHandler(ActionEvent.ACTION, (ActionEvent event) -> {
            decText.setText("0");
            hexText.setText("0");
            octText.setText("0");
            binText.setText("0");
        });
        
        rechnen.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                int dec;
                switch(RBtns.getSelectedToggle().getUserData().toString()){
                    case "dec":
                        dec = Integer.parseInt(decText.getText().replaceAll(" ", ""), 10);
                        break;
                    case "hex":
                        dec = Integer.parseInt(hexText.getText().replaceAll(" ", ""), 16);
                        break;
                    case "oct":
                        dec = Integer.parseInt(octText.getText().replaceAll(" ", ""), 8);
                        break;
                    case "bin":
                        dec = Integer.parseInt(binText.getText().replaceAll(" ", ""), 2);
                        break;
                    default:
                        dec = 0;
                        break;
                }
                             
                decText.setText(Integer.toString(dec));
                hexText.setText(Integer.toHexString(dec));
                octText.setText(Integer.toOctalString(dec));
                binText.setText(Integer.toBinaryString(dec));
            }
        });
    }

    public static void main(String[] args) {
        launch();
    }
}