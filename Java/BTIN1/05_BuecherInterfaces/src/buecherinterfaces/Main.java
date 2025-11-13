/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buecherinterfaces;

/**
 *
 * @author michael.groni
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Buch b = new Buch(25.00, "Think Again", "Adam Grant");
        
        HatTitel info = b;
        System.out.println("Titel: " + info.getTitel());
        IstWertvoll assess = b;
        System.out.println("Wert: " + assess.getWert());
        
        
    }
    
}
