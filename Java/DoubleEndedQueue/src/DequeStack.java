import java.util.EmptyStackException;
import java.util.LinkedList;

public class DequeStack{
    private LinkedList<Integer> legacyStack = new LinkedList<>();

    public boolean isEmpty() {
        return legacyStack.isEmpty();
    }

    public int peek() {
        return legacyStack.peek();
    }

    public int pop() {
        return legacyStack.pop();
    }

    public void push(int item) {
        legacyStack.push(item);
    }
}
