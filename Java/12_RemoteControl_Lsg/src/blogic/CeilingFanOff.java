/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blogic;

/**
 *
 * @author Meinhard.Lingo
 */
public class CeilingFanOff extends Command{
    CeilingFan receiver;
    
    public CeilingFanOff(CeilingFan receiver){
        this.receiver = receiver;
    }
    
    
    @Override
    public void execute() {
        receiver.off();
    }

    @Override
    public void undo() {
        receiver.medium();
    }
    
}
