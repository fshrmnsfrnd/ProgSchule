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
public class StereoOff extends Command
{
    // instance variables - replace the example below with your own
    private Stereo receiver;

    public StereoOff(Stereo receiver)
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
        //execute() führt die Methode off() des Light-Objektes aus-.
        this.receiver.off();
    }
    public void undo()
    {
        //Das Gegenteil von 'Licht ausschalten' (off()) ist 'Licht einschalten' (on())
        this.receiver.on();
    }
}

