/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primliste;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author n.natzer
 */
public class PrimListe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int end = 100;
        ArrayList<Integer> zahlen = new ArrayList();
        Integer[] allnumbers = new Integer[end-1];
        ArrayList<Integer> primeNumbers = new ArrayList();
        
        //Liste erzeugen
        for(int i = 2; i <= end; i++){
            zahlen.add(i);
            allnumbers[i-2] = i;
        }
        
        
        for(int teilerIndex = 0; teilerIndex <= zahlen.size()-1; teilerIndex++){
            for(int index = 0; index <= zahlen.size()-1; index++){
                if(zahlen.get(index) % zahlen.get(teilerIndex) == 0 &&
                        !Objects.equals(zahlen.get(index), zahlen.get(teilerIndex))){
                    zahlen.remove(index);
                }
            }
        }
        
        
        for(int teilerIndex = 0; teilerIndex <= zahlen.size()-1; teilerIndex++){
            if(teilerIndex < zahlen.size()){
                for(int index = teilerIndex; index <= zahlen.size()-1; index += zahlen.get(teilerIndex)){
                        allnumbers[index] = 0;                
                }
            }
        }
        
        System.out.println(zahlen);
        
        for(int a:allnumbers){
            if(a != 0){
                System.out.println(a);
            }
        }
    }
    
}
