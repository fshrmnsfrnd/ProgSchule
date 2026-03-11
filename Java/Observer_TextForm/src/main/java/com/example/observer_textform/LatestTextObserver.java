package com.example.observer_textform;

import javafx.scene.control.TextField;

public class LatestTextObserver implements Observer {
    TextField outputField;
    InputSubject subject;

    public LatestTextObserver(TextField outputField, InputSubject subject) {
        this.outputField = outputField;
        this.subject = subject;
    }

    @Override
    public void update() {
        outputField.setText(subject.getLastInput());
    }
}
