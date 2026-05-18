/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blogic;

/**
 *
 * @author n.natzer
 */
public class UpperCaseCommand implements Command {

    private Document doc;
    
    public UpperCaseCommand(Document doc) {
        this.doc = doc;
    }
    
    @Override
    public void execute() {
        String newText = this.doc.getText().toUpperCase();
        this.doc.deleteText(0,doc.getText().length());
        this.doc.insertText(newText, 0);
    }

    @Override
    public void undo() {
        String newText = this.doc.getText().toLowerCase();
        this.doc.deleteText(0,doc.getText().length());
        this.doc.insertText(newText, 0);
    }

    @Override
    public String getDescription() {
        return "Macht den ganzen Text UPPER";
    }
    
}
