/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blogic;

import java.util.ArrayList;

/**
 *
 * @author meinhard.lingo
 */
public class MacroCommand extends Command{
    private ArrayList<Command> commands = new ArrayList<>();
    
    public void addCommand(Command command){
        commands.add(command);
    }

    public void removeCommand(int index){
        commands.remove(index);
    }
    
    @Override
    public void execute() {
        for (Command o : commands)
        {
            o.execute();
        }
    }

    @Override
    public void undo() {
        for (int i = commands.size()-1; i >= 0; i--)
        {
            Command o = commands.get(i);
            o.undo();
        }   
    }
}
