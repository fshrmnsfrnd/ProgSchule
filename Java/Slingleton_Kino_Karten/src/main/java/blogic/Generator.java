/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blogic;

import java.util.Vector;
import java.util.Random;

/**
 *
 * @author Nico
 */
public class Generator {
    private static Generator instance = new Generator(); // keine Initialisierung
    Random randnum = new Random();
    private long number = 0;
    private Vector ids;
    
    private Generator()
    {}

    public static Generator getInstance(){
        return instance;
    }

    public long getNumber(){
        long returnValue = number;
        returnValue = randnum.nextInt(100000000) - 1000;
        if(this.ids.contains(returnValue)){
            getNumber();
        }else{
            this.ids.add(returnValue);
        }
        return returnValue;
    }
}
