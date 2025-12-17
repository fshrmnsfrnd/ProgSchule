/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uebunglinkedlists;

/**
 *
 * @author n.natzer
 */
public class SLLNode {
    private int value;

    private SLLNode next;

    public SLLNode(int value, SLLNode next){
        this.setValue(value);
        this.setNext(next);
    }
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }  
    
    public void setNext(SLLNode next) {
        this.next = next;
    }

    public SLLNode getNext() {
        return next;
    }
}
