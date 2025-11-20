import java.util.NoSuchElementException;

public class DoubleLinkedQueue {
    public final IntegerNode head;
    public final IntegerNode tail;

    public DoubleLinkedQueue() {
        tail = new IntegerNode(null);
        head = new IntegerNode(null);

        tail.setNext(null);
        tail.setPrev(head);
        head.setNext(tail);
        head.setPrev(null);
    }

    public boolean isEmpty() {
        return head.getNext() == tail;
    }

    public void push(Integer object) {
        IntegerNode lastNode = tail.getPrev();
        IntegerNode newNode = new IntegerNode(object);

        lastNode.setNext(newNode);
        tail.setPrev(newNode);
        newNode.setNext(tail);
        newNode.setPrev(lastNode);
    }

    public Integer pop() {
        if (this.isEmpty()) {
            throw new NoSuchElementException("IntegerQueue empty, pop() not possible");
        }

        IntegerNode firstNode = head.getNext();
        IntegerNode secondNode = firstNode.getNext();

        head.setNext(secondNode);
        secondNode.setPrev(head);

        return firstNode.getObject();
    }

    @Override
    public String toString() {
        String rs = "[";
        IntegerNode current = head.getNext();
        while(current.getObject() != null){
            rs += current.toString() + "; ";
            current = current.getNext();
        }
        rs = rs.substring(0, rs.length() - 2);
        rs = rs + "]";
        return rs;
    }

    public String toStringReverse() {
        String rs = "[";
        IntegerNode current =tail.getPrev();
        while(current.getObject() != null){
            rs += current.toString() + "; ";
            current = current.getPrev();
        }
        rs = rs.substring(0, rs.length() );//- 2);
        rs = rs + "]";
        return rs;
    }

    static class IntegerNode{
        private final Integer object;
        private IntegerNode next;
        private IntegerNode prev;

        public IntegerNode(Integer object) {
            this.object = object;
            this.next = null;
            this.prev = null;
        }

        @Override
        public String toString() {
            return String.valueOf(object);
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

        public IntegerNode getPrev() {return this.prev;}

        public void setPrev(IntegerNode prev){this.prev = prev;}
    }
}
