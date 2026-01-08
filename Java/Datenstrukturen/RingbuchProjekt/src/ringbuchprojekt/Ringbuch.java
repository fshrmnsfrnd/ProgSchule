/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ringbuchprojekt;

import java.util.Vector;

/**
 *
 * @author Nico
 */
public class Ringbuch{
    private Vector<Seite> seiten = new Vector();

    public Ringbuch(Vector<Seite> seiten) {
        if(seiten.isEmpty()){
            seiten.add(new Seite(1));
        }
        this.addSeite(seiten);
    }
    
    public String getSeitennummern(){
        String seitenzahlen = "";
        for(Seite seite:seiten){
            seitenzahlen = seitenzahlen + " " + String.valueOf(seite.getNummer());
        }
        return seitenzahlen;
    }
    
    public void addSeite(Vector<Seite> neueSeiten){
        for(Seite seite:neueSeiten){
            this.seiten.add(seite);
        }
    }
}
