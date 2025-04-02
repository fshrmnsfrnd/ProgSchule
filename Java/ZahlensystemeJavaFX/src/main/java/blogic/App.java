package blogic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
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
        decRB.setToggleGroup(RBtns);
        RadioButton hexRB = new RadioButton("Hex");
        hexRB.setToggleGroup(RBtns);
        RadioButton octRB = new RadioButton("Oct");
        octRB.setToggleGroup(RBtns);
        RadioButton binRB = new RadioButton("Bin");
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
        
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();
        var scene = new Scene(root, 640, 480);
        
        stage.setTitle("DecHexBinOct");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}