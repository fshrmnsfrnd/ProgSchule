/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package blogic;

/**
 *
 * @author n.natzer
 */
public class Rekursiv_Fakulteat {

    public static long fakultaet(int zahl){
        if(zahl == 0){
            return 1;
        }
            return zahl * fakultaet(zahl - 1);
    }
    
    public static void main(String[] args) {
        System.out.println(fakultaet(5));
    }
}
