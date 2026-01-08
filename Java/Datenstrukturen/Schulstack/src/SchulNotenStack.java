import java.util.Stack;

public class SchulNotenStack {
    private Stack<Note> legacyStack = new Stack<>();

    public boolean isEmpty() {
        return legacyStack.isEmpty();
    }

    public Note peek() {
        return legacyStack.peek();
    }

    public Note pop() {
        return legacyStack.pop();
    }

    public void push(Note item) {
        legacyStack.push(item);
    }
}
