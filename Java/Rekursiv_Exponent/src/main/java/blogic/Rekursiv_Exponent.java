/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package blogic;

/**
 *
 * @author n.natzer
 */
public class Rekursiv_Exponent {
    
    public static int potenzieren(int basis, int exponent){
        int ergebnis = 0;
        
        if(exponent > 1){
            ergebnis = basis * potenzieren(basis, exponent - 1);
        }
        System.out.println("Basis: " + basis + " Expo: " + exponent);
        return ergebnis;
    }

    public static void main(String[] args) {
        System.out.println(potenzieren(6, 3));
    }
}
