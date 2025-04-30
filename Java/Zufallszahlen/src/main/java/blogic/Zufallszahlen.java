/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package blogic;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Nico
 */
public class Zufallszahlen {

    public static void main(String[] args) {
        Random randnum = new Random();
        
        ArrayList<Integer> zahlen = new ArrayList<Integer>();
        int counter = 0;
        
        for(int i = 1; i <= 1000000; i++){
            zahlen.add(randnum.nextInt(6));
        }
        
        for(int num: zahlen){
            if(num == 5){
                counter++;
            }
        }
        
        System.out.println("Anzahl 5er: " + counter);
        
    }
}
