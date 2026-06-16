/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package blogic;

/**
 *
 * @author n.natzer
 */
public interface Command {
    public void execute();
    public void undo();
    public String getDescription();
}
