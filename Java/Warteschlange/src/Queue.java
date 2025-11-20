import java.util.NoSuchElementException;

public abstract class Queue {
    public final IntegerNode head;
    public final IntegerNode tail;

    public Queue() {
        tail = new IntegerNode(null);
        head = new IntegerNode(null);

        tail.setNext(head);
        head.setNext(tail);
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

    public boolean isEmpty() {
        return head.getNext() == tail;
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

    public Integer peek() {
        if (this.isEmpty()) {
            throw new NoSuchElementException("IntegerQueue empty, pop() not possible");
        }

        return head.getNext().getObject();
    }

    static class IntegerNode {

        private final Integer object;
        private IntegerNode next;

        @Override
        public String toString() {
            return String.valueOf(object);
        }

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

}

