/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blogic;

/**
 *
 * @author ml
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Document doc = new Document();
        MacroCommand macroCmd = new MacroCommand(doc);

        
        /*** Command: INSERT, Hallo, btin2!, pos: 0 ***/
        InsertTextCommand insertHalloBTIN = new InsertTextCommand(doc, "Hallo, btin2!");
        insertHalloBTIN.execute();
        System.out.println(doc.toString());
        
        //Command zu MacroCommand hinzufügen 
        macroCmd.addCommand(insertHalloBTIN);
        
        /*** Command: DELETE, pos:12, len: 1 ***/
        DeleteTextCommand deleteCmd = new DeleteTextCommand(doc);
        deleteCmd.execute();
        System.out.println(doc.toString());

        //Command zu MacroCommand hinzufügen 
        macroCmd.addCommand(deleteCmd);
        
        /*** UPPER ***/
        UpperCaseCommand upperCmd = new UpperCaseCommand(doc);
        upperCmd.execute();
        System.out.println(doc.toString());

        //Command zu MacroCommand hinzufügen 
        macroCmd.addCommand(upperCmd); 

        
        /*** UNDO MacroCommand ***/
        macroCmd.undo();
        System.out.println(doc.toString());

   

    }
 
}
