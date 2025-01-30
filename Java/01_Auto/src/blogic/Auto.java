/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blogic;

/**
 *
 * @author n.natzer
 */
public class Auto {
    private double tankVolumen;
    private double tankInhalt;
    private double verbrauchProKM;
    
    //Konstruktoren
    //Standardkonstruktor
    public Auto(){
        this.tankVolumen = 60;
        this.tankInhalt = 20;
        this.verbrauchProKM = 6.7;
    }
    
    public Auto(double tankVolumen, double tankInhalt, double verbrauchProKM){
        this.tankVolumen = tankVolumen;
        this.tankInhalt = tankInhalt;
        this.verbrauchProKM = verbrauchProKM;
    }
    
    //Getter und Setter

    public double getTankVolumen() {
        return tankVolumen;
    }

    public void setTankVolumen(double tankVolumen) {
        this.tankVolumen = tankVolumen;
    }

    public double getTankInhalt() {
        return tankInhalt;
    }

    public double getVerbrauchProKM() {
        return verbrauchProKM;
    }

    public void setVerbrauchProKM(double verbrauchProKM) {
        this.verbrauchProKM = verbrauchProKM;
    }
    
    //Andere Methoden
    
    public boolean istErreichbar(double kilometer){
        if((this.tankInhalt / this.verbrauchProKM) >= kilometer){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean tanken(double sprit){
        if((sprit + this.tankInhalt) <= this.tankVolumen && sprit >= 0){
            this.tankInhalt += sprit;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean fahren(double strecke){
    if(this.istErreichbar(strecke)){
        this.tankInhalt -= strecke * this.verbrauchProKM;
        return true;
    }else{
        return false;
    }
    }
    
}
