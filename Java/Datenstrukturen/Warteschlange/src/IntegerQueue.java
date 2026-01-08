public class IntegerQueue extends Queue {
    public IntegerQueue() {
        super();
    }

    public void add(Integer object) {
        IntegerNode lastNode = tail.getNext();
        IntegerNode newNode = new IntegerNode(object);

        lastNode.setNext(newNode);
        newNode.setNext(tail);
        tail.setNext(newNode);
    }
}
