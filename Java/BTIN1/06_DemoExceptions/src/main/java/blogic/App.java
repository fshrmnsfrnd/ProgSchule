package blogic;

import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args){
        //Aufgabe 1
        /*
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ganzzahldivision");
        System.out.print("Dividend: ");
        int dividend = scanner.nextInt();
        System.out.print("Divisor: ");
        int divisor = scanner.nextInt();
        
        try{
            int quotient = dividend / divisor; // Programmabbruch, falls divisor==0
            int rest = dividend % divisor;
            System.out.println("Ergebnis: " + quotient + " Rest " + rest);
        }
        catch(java.lang.ArithmeticException ex){
            System.err.println(ex.getLocalizedMessage());
        }
        */
        
        //Aufgabe 2
        Path path = Paths.get("C:\\Users\\Nico\\Documents\\Schule\\ProgSchule\\Java\\06_DemoExceptions\\test.txt");
        
        try {
            for(String zeile : Files.readAllLines(path)){
                System.out.println(zeile);
            }
        } catch (IOException ex) {
            System.out.println("Kein File");
            //Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            System.out.println("Ende");
        }

    }
}