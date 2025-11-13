/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

import java.math.BigInteger;


public class EanSupport {
   public void validate(String ean)  
   {    
        //starten Sie die Längeprüfung
        this.checkLength(ean, 13);

        //starten Sie die Nummerprüfung
        this.checkNumeric(ean);

        //Prüfen Sie, ob die gelesenen Prüfziffer gleich der berechneten ist
        int readPz = Integer.valueOf(ean.substring(12, 13));
        int calcPz = calcPz(ean);
        if(readPz != calcPz){
            throw new EanIntegrityException();
        }
   }
   
   private int calcPz(String ean) 
   {
        int sum = 0;
        int pz = 0, rest = 0, diff = 0;
        
        //calc PZ
        for(int i = 0; i < (ean.length() - 1); i++)
        {
            int number = Character.getNumericValue(ean.charAt(i));
            
            if ((i + 1) % 2 == 0) {
                sum = sum + 3 * number;
            }
            else{
                sum = sum + number;
            }
        }
        //bestimmung des Rests
        rest = sum % 10;
        diff = 10-rest;
        pz = diff % 10;
        return pz;  
   }
   
   private void checkLength(String ean,int validLength)  
   {
       //hier müssen Sie die Prüfungen einbauern
       if(ean.length() != validLength){
           throw new EanLengthException();
       } 
       
   }
   private void checkNumeric(String ean) 
   {
       try{
           new BigInteger(ean);
       }catch(NumberFormatException e){
           throw new EanNumericException();
       }
   }  
}
