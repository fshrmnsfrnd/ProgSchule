/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg30_remotecontrol;

/**
 *
 * @author Nico
 */
public class StereoOffCmd implements Command {
    private Stereo receiver;
    
    public StereoOffCmd(Stereo receiver) {
        this.receiver = receiver;
    }
    
    @Override
    public void execute() {
        receiver.off();
    }

    @Override
    public void undo() {
        receiver.on();
    }
}
