/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg30_remotecontrol;

import java.util.ArrayList;

/**
 *
 * @author Nico
 */
public class RemoteControl {
    private ArrayList<Command> onCmds = new ArrayList<Command>();
    private ArrayList<Command> offCmds = new ArrayList<Command>();
    private Command lastCmd;
    
    public void addCmd(Command onCmd, Command offCmd){
        onCmds.add(onCmd);
        offCmds.add(offCmd);
    }
    
    public void removeCmd(Command onCmd, Command offCmd){
        onCmds.remove(onCmd);
        offCmds.remove(offCmd);
    }
    
    public void onCmd(int index){
        onCmds.get(index).execute();
        lastCmd = onCmds.get(index);
    }
    
    public void offCmd(int index){
        offCmds.get(index).execute();
        lastCmd = offCmds.get(index);
    }
    
    public void undo(){
        lastCmd.undo();
    }
}
