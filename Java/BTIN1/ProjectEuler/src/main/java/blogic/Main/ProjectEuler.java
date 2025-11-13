/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package blogic.Main;
import java.util.Vector;

/**
 *
 * @author Nico
 */
public class ProjectEuler {

    public static void main(String[] args) {
        String numbers = "73167176531330624919225119674426574742355349194934" +
"96983520312774506326239578318016984801869478851843" +
"85861560789112949495459501737958331952853208805511" +
"12540698747158523863050715693290963295227443043557";
    
        Vector<Integer> ziffern = null;
    for(int i = 0; i < numbers.length(); i++){
        ziffern.add((int)numbers.charAt(i));
    }
    
    Vector<Vector> lists = null;
    int counter = 0;
    int nulls = 0;
    while(!ziffern.isEmpty()){
        if(ziffern.lastElement() != 0){
        lists[counter].add();
        counter++;
        }
    }
    
}}