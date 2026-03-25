/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg30_remotecontrol;

/**
 *
 * @author Nico
 */
public class StereoOnCmd implements Command {
    private Stereo receiver;
    
    public StereoOnCmd(Stereo receiver) {
        this.receiver = receiver;
    }
    
    @Override
    public void execute() {
        receiver.on();
    }

    @Override
    public void undo() {
        receiver.off();
    }
}
