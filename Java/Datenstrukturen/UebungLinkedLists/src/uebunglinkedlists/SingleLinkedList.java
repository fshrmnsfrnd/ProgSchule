/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uebunglinkedlists;

/**
 *
 * @author n.natzer
 */

public class SingleLinkedList {
    public SLLNode head;
    public SLLNode tail;
    
    public SingleLinkedList(){
        this.head = new SLLNode(0, tail);
        this.tail = new SLLNode(0, head);
    }
    
    //Am Ende anfügen
    public void add(int value){
        SLLNode newNode = new SLLNode(value, null);
        tail.getNext().setNext(newNode);
        tail.setNext(newNode);
    }
    
    //Vorderstes Element entfernen
    public SLLNode pop(){
        SLLNode first = head.getNext();
        head.setNext(first.getNext());
        return first;
    }
}
