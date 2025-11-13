import java.util.LinkedList;

public class DequeIntStack implements IntegerStack {
    private LinkedList<Integer> legacyStack = new LinkedList<>();

    @Override
    public boolean isEmpty() {
        return legacyStack.isEmpty();
    }

    @Override
    public int peek() {
        return legacyStack.peek();
    }

    @Override
    public int pop() {
        return legacyStack.pop();
    }

    @Override
    public void push(int item) {
        legacyStack.push(item);
    }
}
