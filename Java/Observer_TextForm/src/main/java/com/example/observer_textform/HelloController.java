package com.example.observer_textform;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField txtInput;
    @FXML
    private TextField txtLatestText;
    @FXML
    private TextArea txtList;
    @FXML
    private Button btnSave;
    @FXML
    private Button btnDelete;
    InputSubject subject;

    public void initialize() {
        subject = new InputSubject();
        subject.registerObserver(new LatestTextObserver(txtLatestText, subject));
        subject.registerObserver(new ListTextObserver(txtList, subject));
    }

    @FXML
    protected void onSaveButtonClick() {
        subject.addInput(txtInput.getText());
    }

    @FXML
    protected void onDeleteButtonClick() {
        subject.removeInput(txtInput.getText());
    }
}
