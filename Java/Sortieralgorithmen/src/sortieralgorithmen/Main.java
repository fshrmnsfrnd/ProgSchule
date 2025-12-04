/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortieralgorithmen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author michaelgroni
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    
    private static String array2String(int[] numbers)
    {
        StringBuilder sb = new StringBuilder();
        
        for (var number : numbers)     // var = Datentyp automatisch
        {
            sb.append(number).append(' ');
        }
        
        return sb.toString();
    }
    
    private static String list2String(List<Integer> numbers)
    {
        StringBuilder sb = new StringBuilder();
        
        for (var number : numbers)     // var = Datentyp automatisch
        {
            sb.append(number).append(' ');
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args)
    {
        Random random = new Random();
        
        // Zufallszahlen erzeugen
        int[] numbersArray = new int[11];
        ArrayList<Integer> numbersList = new ArrayList<>();
        
        for (int i=0; i< numbersArray.length; i++)
        {
            int number = random.nextInt(100);   // [0; 99]
            numbersArray[i] = number;
            numbersList.add(number);
        }
        
        System.out.println("Vorher:");
        System.out.println(array2String(numbersArray));
        
        System.err.println("Nachher:");
        BTIN2sort.selectionsort(numbersArray);
        System.out.println(array2String(numbersArray));
        BTIN2sort.quicksort(numbersArray);
        System.out.println(array2String(numbersArray));
        BTIN2sort.mergesort(numbersList);
        System.out.println(list2String(numbersList));

    }
    
}
