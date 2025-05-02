/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package blogic;

/**
 *
 * @author Nico
 */
public interface Interface {
    public int i = 0;
    
    public int func();
    
    default int dfunc(){
        return 3;
    }
    
}
