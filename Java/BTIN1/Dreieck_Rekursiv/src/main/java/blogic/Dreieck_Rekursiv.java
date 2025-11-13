/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package blogic;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Nico
 */
public class Dreieck_Rekursiv {

    private static void printLine(int anzahlZeichen, int breite, PrintWriter out){
        
        if(anzahlZeichen <= 0){
            return;
        }
        
        String line = "";
        //Leerzeichen
        for(int i = 1; i <= ((breite - anzahlZeichen) / 2); i++){
            line += " ";
        }
        
        //Xe
        for(int i = 1; i <= anzahlZeichen;i++){
            line += "X";
        }
        
        out.println(line);
        printLine(anzahlZeichen - 2, breite, out);
        return;
    }
            
    public static void main(String[] args) {
        try{
            PrintWriter out = new PrintWriter("./dreieck.txt");
            printLine(111, 111, out);
            out.close();
        }catch(Exception e){
            System.err.println("Error initialising PrintWriter" + e.getLocalizedMessage());
        }
          
    }
}
