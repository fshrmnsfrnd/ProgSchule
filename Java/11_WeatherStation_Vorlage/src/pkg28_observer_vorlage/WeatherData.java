/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg28_observer_vorlage;

import java.util.ArrayList;
import java.util.Observer;
import java.util.Random;

/**
 *
 * @author ml
 */
public class WeatherData implements Subject {
    //Weatherstation
    private static WeatherData instance = null;
    Thread t = null; 
    private int temperatur;
    private boolean stop = false;
    private ArrayList<WeatherObserver> observers = new ArrayList<>();
    
    private WeatherData()
    {
       initMessurement(); 
    }
    
    public synchronized static WeatherData getInstance(){
        if (instance == null) {
            instance = new WeatherData();
        }
        return instance;
    }
    
    public int getTemperatur() {
        return temperatur;
    }
    
    public void start(){
        stop();
        stop = false;
        initMessurement(); 
        t.start();  
    }

    public void stop()
    {
        stop = true;
    }    
    private void initMessurement() {
        t = new Thread() {
            public void run() {
            Random rand = new Random();
            try {
                while (!stop) {
                    temperatur = rand.nextInt(40);
                    notifyObservers();
                    Thread.sleep(5000);
                }
            } catch (InterruptedException e) {
                System.out.printf("%s has been interrupted. How rude!",
                        Thread.currentThread().getName());
            } finally {
                System.out.printf("%s is finally done!\n", Thread
                        .currentThread().getName());
            }
            }
        }; 
       
    }

    @Override
    public void registerObserver(WeatherObserver o) {
        this.observers.add(o);
    }

    @Override
    public void unRegisterObserver(WeatherObserver o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for  (WeatherObserver o : this.observers) {
            o.update();
        }
    }
}
