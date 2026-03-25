
/**
 * 
 * @author (ml) 
 * @version (11.02.2022)
 */

package blogic;

public class TvOn extends Command
{
    // instance variables - replace the example below with your own
    private TV receiver;

    public TvOn(TV receiver)
    {
            setReceiver(receiver);
    }
    
    public void setReceiver(TV receiver)
    {
        //die Instanvariable receiver erhält die Referenz
        // auf ein Light-Objekt
        this.receiver = receiver;
    }

    public void execute()
    {
        //execute() führt die Methode switchOn() des TV-Objektes aus-.
        this.receiver.on();
    }
    public void undo()
    {
        //Das Gegenteil von 'TV einschalten' (switchOn()) ist 'TV ausschalten' (switchOff())
        this.receiver.off();
    }
}
