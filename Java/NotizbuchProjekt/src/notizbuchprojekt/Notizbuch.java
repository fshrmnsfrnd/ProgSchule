/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package notizbuchprojekt;

import java.util.Vector;

/**
 *
 * @author Nico
 */
public class Notizbuch{
    private Vector<Seite> seiten = new Vector();

    public Notizbuch(int anzahlSeiten) {
        if(anzahlSeiten < 10){
            anzahlSeiten = 10;
        }
        for (int i = 1; i <= anzahlSeiten; i++) {
            this.seiten.add(new Seite(i));
        }
    }
    
    public String getSeitennummern(){
        String seitenzahlen = "";
        for(Seite seite:seiten){
            seitenzahlen = seitenzahlen + " " + String.valueOf(seite.getNummer());
        }
        return seitenzahlen;
    }
}
