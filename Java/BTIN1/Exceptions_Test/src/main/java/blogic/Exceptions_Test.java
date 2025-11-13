package blogic;

import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class Exceptions_Test {
    
    private static Scanner scan = new Scanner(System.in);
    
    public static int einlesen() {
        int zahl = 0;
        try {
            zahl = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Keine gültige Zahl");
            zahl = einlesen();
        }
        return zahl;
    }

    public static void main(String[] args) {
        System.out.println("Dividend:");
        int dividend = einlesen();
        System.out.println("Divisor:");
        int divisor = einlesen();
        int ergebnis = 0;
        int rest = 0;
        
        try{
            ergebnis = dividend / divisor;
            rest = dividend % divisor;
            System.out.println("Erg: " + ergebnis + " Rest: " + rest);
        }catch(Exception e){
            System.out.println("Fehler bei der Rechenoperation");
        }
    }
}