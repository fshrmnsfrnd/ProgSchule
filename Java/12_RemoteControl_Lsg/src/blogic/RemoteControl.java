
/**
 * 
 * @author (ml) 
 * @version (11.02.2022)
 */
package blogic;

import java.util.ArrayList;

public class RemoteControl{
    // instance variables - replace the example below with your own
    private ArrayList<Command> onList = new ArrayList<>();
    private ArrayList<Command>  offList = new ArrayList<>();
    private Command lastCmd = null;

    public void insertOnCommand(int slotIndex, Command newOnCommand){
          onList.add(slotIndex,newOnCommand);

    }
    public void removeOnCommand(int slotIndex){
          onList.remove(slotIndex);

    }
    public void insertOffCommand(int slotIndex, Command newOffCommand){
          offList.add(slotIndex,newOffCommand);
    }
    public void removeOffCommand(int slotIndex){
           offList.remove(slotIndex);

    }
    public void pressOnCommand(int slotIndex){
        Command cmd = onList.get(slotIndex);
        cmd.execute();
        lastCmd = cmd;
    }
    public void pressOffCommand(int slotIndex){
        Command cmd = offList.get(slotIndex);
        cmd.execute();
        lastCmd = cmd;
    }
    
    public void undoLastCommand(){
        if (lastCmd != null){
            lastCmd.undo();
            lastCmd = null;
        }
        
    }
    public int getCommandsCount(){
        return offList.size();
    }
}
