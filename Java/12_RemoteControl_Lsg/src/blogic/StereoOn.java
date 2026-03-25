/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blogic;

/**
 *
 * @author meinhard.lingo
 */
public class StereoOn extends Command
{
    // instance variables - replace the example below with your own
    private Stereo receiver;

    public StereoOn(Stereo receiver)
    {
            setReceiver(receiver);
    }
    public void setReceiver(Stereo receiver)
    {
        //die Instanvariable receiver erhält die Referenz
        // auf ein Light-Objekt
        this.receiver = receiver;
    }

    public void execute()
    {
        //execute() führt die Methode on() des Light-Objektes aus-.
        this.receiver.on();
    }
    public void undo()
    {
        //Das Gegenteil von 'Licht einschalten' (on()) ist 'Licht ausschalten' (off())
        this.receiver.off();
    }
}
