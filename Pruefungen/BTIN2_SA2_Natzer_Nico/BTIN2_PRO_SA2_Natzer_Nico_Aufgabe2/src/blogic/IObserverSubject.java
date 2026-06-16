/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package blogic;

/**
 *
 * @author ml
 */
public interface IObserverSubject {
    public void registerObserver(IObserver o);
    
    public void unregisterObserver(IObserver o);
    
    public void notifyObservers();
}
