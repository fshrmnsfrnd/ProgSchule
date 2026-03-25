
/**
 * 
 * @author (ml) 
 * @version (11.02.2022)
 */

package blogic;

public class LightOn extends Command{
    // instance variables - replace the example below with your own
    private Light receiver;

    public LightOn(Light receiver){
        setReceiver(receiver);
    }
    
    public void setReceiver(Light receiver){
        //die Instanvariable receiver erhält die Referenz
        // auf ein Light-Objekt
        this.receiver = receiver;
    }

    public void execute(){
        //execute() führt die Methode on() des Light-Objektes aus-.
        this.receiver.on();
    }
    
    public void undo(){
        //Das Gegenteil von 'Licht einschalten' (on()) ist 'Licht ausschalten' (off())
        this.receiver.off();
    }
}
