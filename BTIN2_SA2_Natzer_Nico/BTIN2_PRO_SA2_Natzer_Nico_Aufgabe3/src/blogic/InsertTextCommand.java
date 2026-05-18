/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blogic;

/**
 *
 * @author n.natzer
 */
public class InsertTextCommand implements Command {
    private Document doc;
    private String insertText;
    
    public InsertTextCommand(Document doc, String insertText) {
        this.doc = doc;
        this.insertText = insertText;
    }
    
    @Override
    public void execute() {
        doc.insertText(insertText, 0);
    }

    @Override
    public void undo() {
        doc.deleteText(0, insertText.length());
    }

    @Override
    public String getDescription() {
        return "Ein fixer Text pro Objekt wird eingefügt";
    }
    
}
