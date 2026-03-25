
/**
 * 
 * @author (ml) 
 * @version (11.02.2022)
 */

package blogic;

public class TvOff extends Command
{
    // instance variables - replace the example below with your own
    private TV receiver;
    
    public TvOff(TV receiver)
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
        //execute() führt die Methode switchOff() des TV-Objektes aus-.
        this.receiver.off();
    }
    public void undo()
    {
        //Das Gegenteil von 'TV auschalten' (switchOff()) ist 'TV einschalten' (switchOn())
        this.receiver.on();
    }
}
