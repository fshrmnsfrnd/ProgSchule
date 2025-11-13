/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package code;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        

        EanSupport eanSupport = new EanSupport();
        String status = "Die Ean ist gültig!";
        
        //Initialisierung
        String ean = null;
        Scanner scan = new Scanner(System.in);
        

        System.out.print("Bitte EAN eingeben: ");
        ean = scan.nextLine();

        //Prüfung der EAN mit Fehlerbehandlung
        try{
        eanSupport.validate(ean);
        }catch(Exception e){
            status = "Die EAN in ungueltig";
            System.out.println(e);
        }
        System.out.println(status);
        
    }

}
