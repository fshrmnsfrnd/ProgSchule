/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ringbuchprojekt;

import java.util.Vector;

/**
 *
 * @author Nico
 */
public class RingbuchProjekt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Seite seite1 = new Seite(1);
        Seite seite2 = new Seite(2);
        Seite seite3 = new Seite(3);
        Vector<Seite> seiten = new Vector();
        Ringbuch buch1 = new Ringbuch(seiten);
        
    }
    
}
