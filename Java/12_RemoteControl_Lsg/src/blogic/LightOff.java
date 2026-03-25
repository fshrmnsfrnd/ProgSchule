
/**
 * 
 * @author (ml) 
 * @version (11.02.2022)
 */

package blogic;

public class LightOff extends Command
{
    // instance variables - replace the example below with your own
    private Light receiver;

    public LightOff(Light receiver)
    {
            setReceiver(receiver);
    }
    
    public void setReceiver(Light receiver)
    {
        //die Instanvariable receiver erhält die Referenz
        // auf ein Light-Objekt
        this.receiver = receiver;
    }

    public void execute()
    {
        //execute() führt die Methode off() des Light-Objektes aus-.
        this.receiver.off();
    }
    public void undo()
    {
        //Das Gegenteil von 'Licht ausschalten' (off()) ist 'Licht einschalten' (on())
        this.receiver.on();
    }
}
