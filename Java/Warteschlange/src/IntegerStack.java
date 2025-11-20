public class IntegerStack extends Queue {
    public IntegerStack() {
        super();
    }

    public void push(Integer object) {
        IntegerNode firstNode = head.getNext();
        IntegerNode newNode = new IntegerNode(object);

        newNode.setNext(firstNode);
        head.setNext(newNode);
    }
}

