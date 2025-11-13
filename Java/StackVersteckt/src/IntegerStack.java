import java.util.Stack;

public class IntegerStack {
    private Stack<Integer> legacyStack = new Stack<>();

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
