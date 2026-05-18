/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blogic;

/**
 * Document - der Receiver, der die eigentliche Arbeit macht
 */
public class Document {
    // content: text des Dokuments, zu Beginn: ""
    private StringBuilder content;
    
    public Document() {
        this.content = new StringBuilder();
    }
    
    public void insertText(String text, int position) {
        // Fügt text and position im content ein
        if (position < 0 || position > content.length()) {
            throw new IllegalArgumentException("Ungültige Position: " + position);
        }
        content.insert(position, text);
    }
    
    public String deleteText(int position, int length) {
        // Löscht ab position die length an Buchstaben aus dem content
        // der gelöschte Text (deletedText) wird zurückgegeben (return)
        if (position < 0 || position + length > content.length()) {
            throw new IllegalArgumentException("Ungültige Position oder Länge");
        }
        String deletedText = content.substring(position, position + length);
        content.delete(position, position + length);
        return deletedText;
    }

    
    public String getText() {
        // Getter für den content
        return content.toString();
    }

    
    @Override
    public String toString() {
        // Wandelt den Content in einen String
        return content.toString();
    }
}
