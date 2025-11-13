package blogic.Main;
import java.math.BigInteger;

public class Konto {
    private String inhaber;
    public String kontonummer;
    private double kontostand = 0;
    public String iban;
    final private String bankleitzahl = "71152570";
    
    public Konto(String newInhaber, String newKontonummer, String landKrzl){
        if(!(newKontonummer.length() >= 6 && newKontonummer.length() <= 10)){
            this.kontonummer = "**********";
        }else{
            this.kontonummer = newKontonummer;
        }
        this.inhaber = newInhaber;
        
       //IBAN-----------------------------------------
       
       String szuberechnen = this.bankleitzahl + this.kontonummer;
       szuberechnen += Character.getNumericValue(landKrzl.charAt(0));
       szuberechnen += Character.getNumericValue(landKrzl.charAt(1));
       szuberechnen += "00";
       BigInteger izuberechnen = new BigInteger(szuberechnen);
       int ziffer = izuberechnen.intValue() % 97;
       int prufziffer = 98 - ziffer;
       this.iban = landKrzl + prufziffer + this.bankleitzahl + this.kontonummer;
       
       //----------------------------------------------
    }  

    public String getIban() {
        return iban;
    }
    
    

    public String getInhaber() {
        return this.inhaber;
    }

    public String getKontonummer() {
        return this.kontonummer;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void einzahlen(double eingezahlt){
        if(eingezahlt >= 0){
            this.kontostand += eingezahlt;
        }
    }
    
    public boolean auszahlen(double betrag){
        if(betrag >= 0 && betrag <= this.getKontostand()){
            this.kontostand -= betrag;
            return true;
        }else{return false;}
    }
    
}
