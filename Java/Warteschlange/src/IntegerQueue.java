import java.util.NoSuchElementException;

public class IntegerQueue {
    private final IntegerNode head;
    private final IntegerNode tail;

    public IntegerQueue() {
        tail = new IntegerNode(null);
        head = new IntegerNode(null);

        tail.setNext(head);
        head.setNext(tail);
    }

    public boolean isEmpty() {
        return head.getNext() == tail;
    }

    public void add(Integer object) {
        IntegerNode lastNode = tail.getNext();
        IntegerNode newNode = new IntegerNode(object);

        lastNode.setNext(newNode);
        newNode.setNext(tail);
        tail.setNext(newNode);
    }

    public Integer pop() {
        if (this.isEmpty()) {
            throw new NoSuchElementException("IntegerQueue empty, pop() not possible");
        }

        IntegerNode firstNode = head.getNext();
        IntegerNode secondNode = firstNode.getNext();

        head.setNext(secondNode);

        if (head.getNext() == tail){
            tail.setNext(head);
        }

        return firstNode.getObject();
    }



}

//Die Klasse IntegerNode hat Paket-Sichtbarkeit,
//erscheint aber nicht in der Klassen-Auflistung
class IntegerNode {

    private final Integer object;
    private IntegerNode next;

    public IntegerNode(Integer object) {
        this.object = object;
        this.next = null;
    }

    public Integer getObject() {
        return object;
    }

    public IntegerNode getNext() {
        return next;
    }

    public void setNext(IntegerNode next){
        this.next = next;
    }

}