/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blogic;

/**
 *
 * @author Nico
 */
public class Auto implements Comparable<Auto> {
    public String kennzeichen;
    public int anzahlRader = 4;
    
    public Auto(String akennzeichen){
        this.kennzeichen = akennzeichen;
    }
    
    @Override
    public int compareTo(Auto auto2){
        return this.kennzeichen.compareToIgnoreCase(auto2.kennzeichen);
    }
}
