/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notizbuchprojekt;

/**
 *
 * @author Nico
 */
public class NotizbuchProjekt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // zu dünnes Buch, muss trotzdem 10 Seiten bekommen
        Notizbuch buch1 = new Notizbuch(5);
        System.out.println("Seiten des dünnen Buchs: ");
        System.out.println(buch1.getSeitennummern());
        
        System.out.println("");
        
        // mittleres Buch
        Notizbuch buch2 = new Notizbuch(20);
        System.out.println("Seiten des mittleren Buchs: ");
        System.out.println(buch2.getSeitennummern());
        
        System.out.println("");
        
        // dickes Buch
        Notizbuch buch3 = new Notizbuch(500);
        System.out.println("Seiten des dicken Buchs: ");
        System.out.println(buch3.getSeitennummern()); 
    }
    
}
