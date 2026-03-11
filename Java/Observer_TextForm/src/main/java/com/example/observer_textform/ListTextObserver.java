package com.example.observer_textform;

import javafx.scene.control.TextArea;

public class ListTextObserver implements Observer {
    TextArea outputField;
    InputSubject subject;

    public ListTextObserver(TextArea outputField, InputSubject subject) {
        this.outputField = outputField;
        this.subject = subject;
    }

    @Override
    public void update() {
        outputField.clear();
        for(String input: subject.getInputs()){
            outputField.appendText(input + "\n");
        }
    }
}
