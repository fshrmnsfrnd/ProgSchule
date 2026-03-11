package pkg28_observer_vorlage;

import java.util.Observer;

public interface Subject {
    abstract void registerObserver(WeatherObserver o);
    abstract void unRegisterObserver(WeatherObserver o);
    abstract void notifyObservers();
}