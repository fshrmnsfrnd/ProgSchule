/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package blogic.checkprimzahl;

import java.util.Scanner;
/**
 *
 * @author n.natzer
 */
public class CheckPrimzahl {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Zahl zum checken: ");
        double numberToCheck = scan.nextDouble();
        double minDivisor = 2;
        double maxDivisor = Math.sqrt(numberToCheck);
        boolean teilbar = false;
        
        for(double divisor = minDivisor; divisor <= maxDivisor; divisor++){
            if(numberToCheck % divisor == 0){
                teilbar = true;
                break;
            }
        }

        if(teilbar == true){
            System.out.println("Ist keine Primzahl");
        }else if(teilbar == false){
            System.out.println("Ist eine Primzahl");
        }
    }
}
