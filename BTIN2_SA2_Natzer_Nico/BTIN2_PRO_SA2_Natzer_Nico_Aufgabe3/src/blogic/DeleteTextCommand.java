/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blogic;

/**
 *
 * @author n.natzer
 */
public class DeleteTextCommand implements Command {
    private Document doc;
    private String removedChar;
    
    public DeleteTextCommand(Document doc) {
        this.doc = doc;
    }
    
    @Override
    public void execute() {
        int length = doc.getText().length();
        this.removedChar = String.valueOf(doc.getText().charAt(length - 1));
        doc.deleteText(length - 1, 1);
    }

    @Override
    public void undo() {
        doc.insertText(removedChar, doc.getText().length());
    }

    @Override
    public String getDescription() {
        return "Entfernt das letzte Zeichen";
    }
    
}
