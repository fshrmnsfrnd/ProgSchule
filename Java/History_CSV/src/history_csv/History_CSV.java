/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package history_csv;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Stack;

/**
 *
 * @author Nico
 */
public class History_CSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path = "./history.csv"; 
        
        try{
            Path pfad = Paths.get(path);
            
            String[] lines = Files.readAllLines(pfad).toArray(new String[0]);
            

            for(String line : lines){
                //formatedTxt += formatLine(zeile);
                Stack <String> stack = new Stack<String>();
                for(String col: line.split(";")){
                    System.out.print(col + " ");
                    stack.push(col);
                }
                System.out.print("\n");
                while(!stack.isEmpty()){
                    System.out.print(stack.pop() + " ");
                }
                System.out.print("\n");
            }
            
            //PrintWriter out = new PrintWriter(newPath);
            //out.println(formatedTxt);
            //out.close();
        }catch (IOException ex){
            System.err.println("Ein- oder Ausgabefehler: " + ex.getLocalizedMessage());
        }catch (InvalidPathException e){
            System.err.println("Ungültiger Pfad: " + e.getLocalizedMessage());
        }
    }
    
}
