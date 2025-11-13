package blogic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    int counter = 0;
        
    class plusActionHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            counter++;
            klicks.setText(Integer.toString(counter));
        }
    }
    
    class resetActionHandler implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            counter = 0;
            klicks.setText(Integer.toString(counter));
        }
    }
        
    TextField klicks = new TextField(Integer.toString(counter));
    
    @Override
    public void start(Stage stage) {
        
        GridPane root = new GridPane();
       
        
        root.add(klicks, 0, 0);
       
        Button plus = new Button("Plus");
        root.add(plus, 1, 0);
        plus.addEventHandler(ActionEvent.ACTION, new plusActionHandler());
       
        Button reset = new Button("Reset");
        root.add(reset, 1, 1);
        reset.addEventHandler(ActionEvent.ACTION, new resetActionHandler());
        
        
       var scene = new Scene(root, 640, 480);
       stage.setScene(scene);
       stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}