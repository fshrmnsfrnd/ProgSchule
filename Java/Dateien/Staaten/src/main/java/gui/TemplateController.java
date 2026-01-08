package gui;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

import javafx.event.ActionEvent;

public class TemplateController{

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private TextField textField;

    private final HashMap<String, String> staaten = new HashMap<>();

    public void initialize() {
        ladeDatei();
        Collection<String> countryIDs = this.staaten.keySet();
        LinkedList<String> countries = new LinkedList<>(countryIDs);
        countries.sort(String.CASE_INSENSITIVE_ORDER);
        comboBox.getItems().addAll(countries);
    }

    private void ladeDatei() {
        try (BufferedReader br = new BufferedReader(new FileReader("staaten.csv"))) {
            String zeile;
            while ((zeile = br.readLine()) != null) {
                String[] teile = zeile.replace("\"", "").split(";");
                if (teile.length == 2) {
                    this.staaten.put(teile[0], teile[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void updateTextField(ActionEvent event) {
        String kuerzel = comboBox.getValue();
            if (kuerzel != null) {
                textField.setText(this.staaten.get(kuerzel));
            }
    }
}
