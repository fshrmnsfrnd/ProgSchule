import java.util.Stack;

public class LegacyIntStack implements IntegerStack {
    private Stack<Integer> legacyStack = new Stack<>();

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
