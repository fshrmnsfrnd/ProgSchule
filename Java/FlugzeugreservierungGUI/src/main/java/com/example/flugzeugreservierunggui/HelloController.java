package com.example.flugzeugreservierunggui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    Flugzeugreservierung flugzeug;

    @FXML
    TextField maxPlatze;

    @FXML
    TextField aktuellerZustand;

    @FXML
    TextField freiePlatze;

    @FXML
    TextField reserviertePlatze;

    @FXML
    protected void clickStart(){
        flugzeug = new Flugzeugreservierung(Integer.parseInt(maxPlatze.getText()));
        updateZustand();
    }

    @FXML
    protected void clickReservieren(){
        flugzeug.state.reservieren();
        updateZustand();
    }

    @FXML
    protected void clickStornieren(){
        flugzeug.state.stornieren();
        updateZustand();
    }

    @FXML
    protected void clickSchliessen(){
        flugzeug.state.schliessen();
        updateZustand();
    }

    @FXML
    protected void clickStreichen(){
        flugzeug.state.flugStreichen();
        updateZustand();
    }

    public void updateZustand(){
        aktuellerZustand.setText(flugzeug.stateName);
        freiePlatze.setText(String.valueOf(flugzeug.freiePlatze));
        reserviertePlatze.setText(String.valueOf(flugzeug.reserviertePlatze));
    }
}
