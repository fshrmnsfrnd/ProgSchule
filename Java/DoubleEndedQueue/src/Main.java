import java.util.EmptyStackException;

public class Main {
    public static void main(String[] args) {
        DequeStack iStack = new DequeStack();
        iStack.push(1);
        iStack.push(2);
        iStack.push(3);
        iStack.push(4);
        System.out.println("Oberste Zahl: " + iStack.peek());
        System.out.println("");
        System.out.println("Stack abbauen:");
        while (!iStack.isEmpty()) // Ausgabe 4 3 2 1
        {
            System.out.println(iStack.pop());
        }
        try
        {
            iStack.pop(); // Exception, denn der Stack ist leer.
        }
        catch (Exception e)
        {
            System.out.println("Fehler.");
        }
    }
}