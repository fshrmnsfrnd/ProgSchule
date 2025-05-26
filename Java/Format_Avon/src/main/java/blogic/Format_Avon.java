/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package blogic;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Nico
 */
public class Format_Avon {
    
    private static String formatLine(String zeile) {
        String vorwahl = zeile.substring(0, 6);
        String ort = zeile.substring(6, zeile.length());
        
        return vorwahl + " " + ort + "\n";
    }
    
    

    public static void main(String[] args) throws FileNotFoundException {
        String formatedTxt = "";
        String path = "./avon.txt";
        String newPath = "./avonFormated.txt";
        
        try{
            Path pfad = Paths.get(path);
            for (String zeile : Files.readAllLines(pfad)){
                formatedTxt += formatLine(zeile);
            }
            PrintWriter out = new PrintWriter(newPath);
            out.println(formatedTxt);
            out.close();
        }catch (IOException ex){
            System.err.println("Ein- oder Ausgabefehler: " + ex.getLocalizedMessage());
        }catch (InvalidPathException e){
            System.err.println("Ungültiger Pfad: " + e.getLocalizedMessage());
        }
        
        
        
        
    }
}
