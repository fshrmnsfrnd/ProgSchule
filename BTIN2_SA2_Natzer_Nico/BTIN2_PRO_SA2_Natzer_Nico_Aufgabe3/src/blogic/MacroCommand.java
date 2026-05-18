/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blogic;

import java.util.ArrayList;

/**
 *
 * @author n.natzer
 */
public class MacroCommand implements Command {
    private ArrayList<Command> commands =  new ArrayList();
    private Document doc;
    
    public MacroCommand(Document doc) {
        this.doc = doc;
    }
    
    public void addCommand(Command cmd){
        this.commands.add(cmd);
    }
    
    @Override
    public void execute() {
        if(commands.isEmpty()) return;
        for(int i = 0; i <= commands.size() - 1; i++){
            commands.get(i).execute();
        }
    }

    @Override
    public void undo() {
        if(commands.isEmpty()) return;
        for(int i = commands.size() - 1; i >= 0; i--){
            commands.get(i).undo();
            //System.out.println(doc.getText().toString());
        }
    }

    @Override
    public String getDescription() {
        return "Hier koennen mehrere Commands ausgefuehrt werden";
    }
}
