/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package code;

/**
 *
 * @author Nico
 */
public class EanNotNumericException extends RuntimeException {
    public EanNotNumericException(){
        super("Keine Zahl");
    }
}
