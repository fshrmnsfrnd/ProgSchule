/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package blogic.Main;



/**
 *
 * @author Nico
 */
public class Bankkonto {

    public static void main(String[] args){
        Konto myKonto = new Konto("Nico", "12345678", "DE");
        System.out.println(myKonto.getIban());

    }
}
