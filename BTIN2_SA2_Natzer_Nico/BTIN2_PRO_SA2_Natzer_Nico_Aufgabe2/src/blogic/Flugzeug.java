package blogic;

import java.util.ArrayList;


/**
 * Write a description of class Flugzeug here.
 * 
 * @author (your name) 
 * 
 */

public class Flugzeug implements IObserverSubject{
   
    //Member-Variablen
    private IState state ;
    private int maxPlaetze;
    private int reserviertePlaetze;
    private ArrayList<IObserver> observers = new ArrayList();
    
    
    public Flugzeug(int maxPlaetze){
        if (maxPlaetze < 3){
            throw new RuntimeException("Es müssen mindestens 3 Plätze vorhanden sein.");
        }
        //Flug einrichten
        this.maxPlaetze = maxPlaetze ;
        this.reserviertePlaetze = 0;
        this.state = new OhneReservierung(); 
    }
    
    @Override
    public void registerObserver(IObserver o){
        this.observers.add(o);
    }
    
    @Override
    public void unregisterObserver(IObserver o){
        this.observers.remove(o);
    }
    
    @Override
    public void notifyObservers(){
        for (IObserver o : observers) {  
            o.update(this.reserviertePlaetze);
        } 
    }
    
    //Getter für Membervariablen
    public int getMaxPlaetze(){
        return this.maxPlaetze;
    }
    
    public int getReserviertePlaetze(){
        return this.reserviertePlaetze;
    }
    
    //ander Methoden
    public void reservieren(){
        state.reservieren();
        this.notifyObservers();
    }
    public void stornieren(){
        state.stornieren();
        this.notifyObservers();
    }


    //Interfaces
    private interface IState{
        public String getInfo();
        public void reservieren();
        public void stornieren();

    } 
    
    // States
    private class Ausgebucht implements IState{
        //weitere Methoden
        @Override
        public String getInfo(){
            return "ausgebucht";
        }
        @Override
        public void reservieren(){
            throw new RuntimeException("Alle Plätze sind bereits vergeben.");
        }
        @Override
        public void stornieren(){
            reserviertePlaetze = reserviertePlaetze - 1;
            state = new TeilweiseReserviert();
        }
    }

    private class OhneReservierung implements IState{
        //weitere Methoden
        @Override
        public String getInfo()
        {
            return "ohne Reservierung";
        }
        @Override
        public void reservieren(){
            reserviertePlaetze = reserviertePlaetze +1 ;
            state = new TeilweiseReserviert();
        }
        @Override
        public void stornieren(){
            throw new RuntimeException("Der Flug ist noch ohne Reservierung.");
        }

    }

    private class TeilweiseReserviert implements IState{
        //weitere Methoden
        @Override
        public String getInfo(){
            return "teilweise Reserviert";
        }
        @Override
        public void reservieren(){
            reserviertePlaetze = reserviertePlaetze + 1;
            if (reserviertePlaetze == maxPlaetze){
                state = new Ausgebucht();
            }
        }
        @Override
        public void stornieren(){
            if (reserviertePlaetze == 1){
                state = new OhneReservierung();
            }
            reserviertePlaetze = reserviertePlaetze -1 ;
        }
    }
}
