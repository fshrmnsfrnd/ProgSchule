package blogic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
    
    double ergebnis;
    
    class rechnenHandler implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent t) {
            ergebnis = (double)rohTxt.getValue() * ((double)mTxt.getValue() / (double)fTxt.getValue());
            wTxt.setText(Double.toString(ergebnis));
        }
        
    }
    
    Spinner rohTxt = new Spinner(0, 999999, 0.0178);
    Spinner mTxt = new Spinner(0, 999999, 0);
    Spinner fTxt = new Spinner(0, 999999, 0);
    
    TextField wTxt = new TextField(Double.toString(ergebnis));

    @Override
    public void start(Stage stage) {
        GridPane root = new GridPane();
        
        Label rohLbl = new Label("Roh in OHM*mm*mm/m:");
        root.add(rohLbl, 0, 0);
        root.add(rohTxt, 1, 0);
        
        Label mLbl = new Label("Lange in m:");
        root.add(mLbl, 0, 1);
        root.add(mTxt, 1, 1);
        
        Label fLbl = new Label("Fläche in mm*mm:");
        root.add(fLbl, 0, 2);
        root.add(fTxt, 1, 2);
        
        Button rechnen = new Button("Rechnen");
        rechnen.addEventHandler(ActionEvent.ACTION, new rechnenHandler());
        Button loschen = new Button("Löschen");
        VBox buttons = new VBox(rechnen, loschen);
        root.add(buttons, 2, 0, 1, 3);
        
        Label wLbl = new Label("Widerstand:");
        root.add(wLbl, 0, 3);
        root.add(wTxt, 1, 3, 2, 1);
        
        var scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}