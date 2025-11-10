/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gutscheincodes;

import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;

/**
 *
 * @author Nico
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generator = new Random(); // Generator für Zufallszahlen

        LinkedList<Integer> numbers = new LinkedList<>();

        while (numbers.size()<500001){
            numbers.add(generator.nextInt(500001));
        }

        System.out.println("Es wurden " + numbers.size() + " Codes erzeugt.");
    }
    
}
