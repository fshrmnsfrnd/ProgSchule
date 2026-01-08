
public class Main {
    public static void main(String[] args) {
        IntegerQueue queue = new IntegerQueue();
        IntegerStack stack = new IntegerStack();
        DoubleLinkedQueue linkedQueue = new DoubleLinkedQueue();
        RingBuffer ring = new RingBuffer(10);

        for (int i = 0; i < 10; i++) {
            linkedQueue.push(i);
            queue.add(i);
            stack.push(i);
        }
        System.out.println("Queue: " + queue.toString());
        System.out.println("Stack: " + stack.toString());
        System.out.println("Linked: " + linkedQueue.toString());
        System.out.println("Linked Reverse: " + linkedQueue.toStringReverse());
        while (!queue.isEmpty() && !stack.isEmpty() && !linkedQueue.isEmpty()) {
            queue.pop();
            stack.pop();
            linkedQueue.pop();
        }
    }
}