/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package code;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        

        EanSupport eanSupport = new EanSupport();
        String status;
        
        //Initialisierung
        String ean = null;
        Scanner scan = new Scanner(System.in);
        
        boolean done;
        do{
            System.out.print("Bitte EAN eingeben: ");
            ean = scan.nextLine();
            done = false;

            //Prüfung der EAN mit Fehlerbehandlung
        
            status ="Die Ean ist gültig!";
        
            try{
                eanSupport.validate(ean);
                done = true;
            }catch(Exception e){
                System.out.println(e);
            }
        
            System.out.println(status);
        }while(!done);
    }

}
