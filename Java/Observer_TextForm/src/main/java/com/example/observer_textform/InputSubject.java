package com.example.observer_textform;

import java.util.ArrayList;

public class InputSubject implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    private ArrayList<String> inputs = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }
    public ArrayList<String> getInputs() {
        return inputs;
    }
    public String getLastInput() {
        return inputs.get(inputs.size()-1);
    }
    public void addInput(String input) {
        inputs.add(input);
        this.notifyObservers();
    }
    public void removeInput(String input) {
        inputs.remove(input);
        this.notifyObservers();
    }
}
