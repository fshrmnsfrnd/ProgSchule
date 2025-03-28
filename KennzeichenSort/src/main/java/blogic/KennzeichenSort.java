/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package blogic;

import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class KennzeichenSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Objekt zum Einlesen
        
        System.out.println("Bitte geben Sie zwei KFZ-Kennzeichen ein!");
        
        System.out.println("1. Kennzeichen: ");
        Auto auto1 = new Auto(scanner.nextLine());
        
        System.out.println("2. Kennzeichen: ");
        Auto auto2 = new Auto(scanner.nextLine());
        
        System.out.println("In Reihenfolge:");
        
        if(auto1.compareTo(auto2) <= 0){
            System.out.println(auto1.kennzeichen);
            System.out.println(auto2.kennzeichen);
        }else{
            System.out.println(auto2.kennzeichen);
            System.out.println(auto1.kennzeichen);
        }
        
    }
}
