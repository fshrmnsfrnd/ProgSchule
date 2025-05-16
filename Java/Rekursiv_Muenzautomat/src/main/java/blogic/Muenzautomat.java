/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blogic;

/**
 *
 * @author n.natzer
 */
public class Muenzautomat {
    private int bestand2EUR;
    private int bestand1EUR;
    private int bestand50Cent;

    public Muenzautomat(int bestand2, int bestand1, int bestand50) {
        nachfuellen2EUR(bestand2);
        nachfuellen1EUR(bestand1);
        nachfuellen50Cent(bestand50);
    }
    
    public void auszahlen(double betrag){
        double muenze = 0;
        double gesamtsumme = (bestand2EUR * 2) + (bestand1EUR * 1) + (bestand50Cent * 0.5);
        
        if(((betrag % 1 == 0.5 && bestand50Cent > 0) || betrag % 1 == 0) && gesamtsumme >= betrag){
            if(betrag >= 2 && this.bestand2EUR > 0){
                muenze = 2;
                bestand2EUR--;
            }else if(betrag >= 1 && this.bestand1EUR > 0){
                muenze = 1;
                bestand1EUR--;
            }else if(betrag >= 0.5 && this.bestand50Cent > 0){
                muenze = 0.5;
                bestand50Cent--;
            }else if(betrag >= 0.5 && this.bestand50Cent == 0){
                System.out.println("Keine 50 Cent Muenzen mehr");
            }
            
            if(betrag >= 0.5){
                System.out.println(muenze + " EUR");
                auszahlen(betrag - muenze);
            }
        }else{
            System.out.println("Nicht genug Münzen vorhanden");
        }
        
        
    }
    
    public void nachfuellen2EUR(int anzahl){
        this.bestand2EUR = anzahl;
    }
    
    public void nachfuellen1EUR(int anzahl){
        this.bestand1EUR = anzahl;
    }
    
    public void nachfuellen50Cent(int anzahl){
        this.bestand50Cent = anzahl;
    }
    
    public void printBestandAufKonsole(){
        
    }
}
